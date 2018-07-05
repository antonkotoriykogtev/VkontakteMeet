using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace Login
{
    public class LoginPage : ContentPage
    {
		public App app;
        readonly Label _hintLabel;
        readonly List<Button> _loginButtons = new List<Button>();
        bool _isAuthenticated;

        public LoginPage(App parent)
        {
			app = parent;
            Title = "VkMeet";

            _hintLabel = new Label
            {
                HorizontalTextAlignment = TextAlignment.Center,
                Text = "Вход не выполнен"
            };

            var stackLayout = new StackLayout
            {
                VerticalOptions = LayoutOptions.Center,
                Children = { _hintLabel }
            };

            var providers = new[] { "VK" };
            foreach (var provider in providers)
            {
                var loginButton = new Button
                {
                    HorizontalOptions = LayoutOptions.Center,
                    Text = $"Войти в {provider}",
                    AutomationId = provider
                };

                loginButton.Clicked += LoginButtonOnClicked;

                _loginButtons.Add(loginButton);
                stackLayout.Children.Add(loginButton);
            }

            Content = stackLayout;
        }

        async void LoginButtonOnClicked(object sender, EventArgs e)
        {
            if (_isAuthenticated)
            {
                _hintLabel.Text = "Вход не выполнен";

                var senderBtn = sender as Button;
                if (senderBtn == null) return;

                Logout(senderBtn.AutomationId);

                _isAuthenticated = false;
                foreach (var btn in _loginButtons)
                {
                    btn.IsEnabled = true;
                    btn.Text = $"Войти в {btn.AutomationId}";
                }
            }
            else
            {
                var senderBtn = sender as Button;
                if (senderBtn == null) return;
                
                _hintLabel.Text = "Выполняется вход...";
                var loginResult = await Login(senderBtn.AutomationId);

                foreach (var btn in _loginButtons.Where(b => b != senderBtn))
                    btn.IsEnabled = false;

                switch (loginResult.LoginState)
                {
                    case LoginState.Canceled:
                        _hintLabel.Text = "Вход отменен";
                        foreach (var btn in _loginButtons.Where(b => b != senderBtn))
                            btn.IsEnabled = true;
                        break;
                    case LoginState.Success:
                        _hintLabel.Text = $"Привет, {loginResult.FirstName}!";
                        senderBtn.Text = $"Выйти из {senderBtn.AutomationId}";
                        _isAuthenticated = true;

                        // string token = DependencyService.Get<IVkService>().ExtractToken();
						app.MainPage = new NavigationPage(new MyPage(app, loginResult));

                        break;
                    default:
                        _hintLabel.Text = "Ошибка входа: " + loginResult.ErrorString;
                        foreach(var btn in _loginButtons.Where(b => b != senderBtn))
                            btn.IsEnabled = true;
                        break;
                }
            }
        }

        Task<LoginResult> Login(string providerName)
        {
            switch (providerName.ToLower())
            {
                case "vk":
					return DependencyService.Get<IVkService>().Login();
                default:
                    return DependencyService.Get<IOAuthService>().Login();
            }
        }

        void Logout(string providerName)
        {
            switch (providerName.ToLower())
            {
                case "vk":
                    DependencyService.Get<IVkService>().Logout();
                    return;
                default:
                    DependencyService.Get<IOAuthService>().Logout();
                    return;
            }
        }
    }
}