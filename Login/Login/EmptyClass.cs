using System;
using System.Globalization;
using test;

namespace Login
{
    public class UserItems
    {
        public string id { get; set; }
        public string full_name { get; set; }
        public string age { get; set; }
        public string photo_50 { get; set; }
        public UserItems(VkApiItems old)
        {
            age = "";
            try
            {
                DateTime today = DateTime.Today;
                if (Equals(old.bdate, null))
                {
                    this.age = "";
                }
                if (old.bdate.Length - old.bdate.Replace(".", "").Length < 2)
                {
                    this.age = "";
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
                full_name = old.first_name + " " + old.last_name;
                photo_50 = old.photo_50;
            }
        }
    }
}
