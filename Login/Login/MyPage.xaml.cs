using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Threading.Tasks;
using Newtonsoft.Json;
using test;
using Xamarin.Forms;

namespace Login
{
    public partial class MyPage : ContentPage
    {
        int page;
        int count = 50;
        string reqUri;
        public App app;
        public string token;
        LoginResult user;
        public MyPage() {
            InitializeComponent();
        }
        public MyPage(App parent, LoginResult login)
        {
            user = login;
			app = parent;
            Title = "Поиск по интересам";
            InitializeComponent();
            page = 0;
        }

        void OnListCellTapped(object sender, System.EventArgs e)
        {
            
        }

        void OnSexToggled(object sender, Xamarin.Forms.ToggledEventArgs e)
        {
            if (sex.IsToggled) {
                sexlabel.Text = "Пол: мужской";
            }
            else {
                sexlabel.Text = "Пол: женский";
            }
        }

        void OnAgeFromChanged(object sender, Xamarin.Forms.TextChangedEventArgs e)
        {
            if (agefrom.Text.Length > 2) {
                agefrom.Text = agefrom.Text.Remove(agefrom.Text.Length - 1);
            }
        }

        void OnAgeToChanged(object sender, Xamarin.Forms.TextChangedEventArgs e)
        {
            if (ageto.Text.Length > 2)
            {
                ageto.Text = ageto.Text.Remove(ageto.Text.Length - 1);
            }
        }

	    async void OnFindClicked(object sender, System.EventArgs e) {
            page = 0;
            token = user.Token;
            int sexnum;
            string interestring;
            if (!Equals(interests.Text, null))
            {
                interestring = Uri.EscapeDataString(interests.Text);
            }
            else
            {
                interestring = "";
            }
            if (sex.IsToggled)
            {
                sexnum = 2;
            }
            else
            {
                sexnum = 1;
            }
            reqUri = $"https://api.vk.com/method/users.search?v=5.80&clientId=6622922&access_token={token}&fields=photo_50,bdate&interests={interestring}&age_from={agefrom.Text}&age_to={ageto.Text}&sex={sexnum}&count={count}";
            var r = await GetVkUsers();
            ObservableCollection<UserItems> users = new ObservableCollection<UserItems>();
            for (int i = 0; i < r.Response.Items.Length; ++i)
            {
                users.Add(new UserItems(r.Response.Items[i]));
            }
            usersview.ItemsSource = users;
		}

        public async Task<VkApiResponse> GetVkUsers()
        {
            var result = new VkApiResponse();
            using (var client = new HttpClient())
            {
                var request = new HttpRequestMessage
                {
                    RequestUri = new Uri(reqUri + "&offset=" + (count * page).ToString()),
                    Method = HttpMethod.Get
                };

                request.Headers.Add("Accept", "application/json");
                var response = await client.SendAsync(request);
                if (response.StatusCode == HttpStatusCode.OK)
                {
                    var json = await response.Content.ReadAsStringAsync();
                    var myObj = JsonConvert.DeserializeObject<VkApiResponse>(json);
                    if (!Equals(myObj, null))
                        result = myObj;
                }
            }
            return result;
        }
        protected override bool OnBackButtonPressed()
        {
            app.MainPage = new NavigationPage(new LoginPage(app));
            return true;
        }
	}
}
