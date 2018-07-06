using System;
using System.Globalization;
using test;

namespace Login
{
    public class UserItems
    {
        public string id { get; set; }
        public string text { get; set; }
        public string detail { get; set; }
        public string imagesource { get; set; }
        public UserItems(VkApiItems old)
        {
            string age = "";
            try
            {
                DateTime today = DateTime.Today;
                if (Equals(old.bdate, null))
                {
                    age = "";
                }
                if (old.bdate.Length - old.bdate.Replace(".", "").Length < 2)
                {
                    age = "";
                }
                else
                {
                    age = "Возраст: " + ((int)(today - DateTime.ParseExact(old.bdate, "d.M.yyyy", CultureInfo.InvariantCulture)).TotalDays / 365).ToString();
                }
            }
            catch (System.NullReferenceException)
            {

            }
            finally
            {
                id = old.id;
                text = old.first_name + " " + old.last_name;
                if (!Equals(age, "")) {
                    text += ", " + age;
                }
                detail = "vk.com/id" + id.ToString();
                imagesource = old.photo_50;
            }
        }
    }
}
