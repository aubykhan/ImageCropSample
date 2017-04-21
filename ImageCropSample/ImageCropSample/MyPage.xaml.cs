using System;
using System.Collections.Generic;

using Xamarin.Forms;

namespace ImageCropSample
{
	public partial class MyPage : ContentPage
	{
		public MyPage()
		{
			InitializeComponent();
            BindingContext = new MyPageViewModel();
		}

        private void Button_Clicked(object sender, EventArgs e)
        {
            var imageData = (BindingContext as MyPageViewModel).FrontImageData;
        }
    }

    public class MyPageViewModel
    {
        public byte[] FrontImageData { get; set; }
        public byte[] RearImageData { get; set; }
    }
}
