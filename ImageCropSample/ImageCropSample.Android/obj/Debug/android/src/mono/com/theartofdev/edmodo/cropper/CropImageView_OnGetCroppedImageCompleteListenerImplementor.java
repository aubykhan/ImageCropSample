package mono.com.theartofdev.edmodo.cropper;


public class CropImageView_OnGetCroppedImageCompleteListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.theartofdev.edmodo.cropper.CropImageView.OnGetCroppedImageCompleteListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGetCroppedImageComplete:(Lcom/theartofdev/edmodo/cropper/CropImageView;Landroid/graphics/Bitmap;Ljava/lang/Exception;)V:GetOnGetCroppedImageComplete_Lcom_theartofdev_edmodo_cropper_CropImageView_Landroid_graphics_Bitmap_Ljava_lang_Exception_Handler:Com.Theartofdev.Edmodo.Cropper.CropImageView/IOnGetCroppedImageCompleteListenerInvoker, Xam.Plugins.ImageCropper.Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Theartofdev.Edmodo.Cropper.CropImageView+IOnGetCroppedImageCompleteListenerImplementor, Xam.Plugins.ImageCropper.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CropImageView_OnGetCroppedImageCompleteListenerImplementor.class, __md_methods);
	}


	public CropImageView_OnGetCroppedImageCompleteListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CropImageView_OnGetCroppedImageCompleteListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Theartofdev.Edmodo.Cropper.CropImageView+IOnGetCroppedImageCompleteListenerImplementor, Xam.Plugins.ImageCropper.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onGetCroppedImageComplete (com.theartofdev.edmodo.cropper.CropImageView p0, android.graphics.Bitmap p1, java.lang.Exception p2)
	{
		n_onGetCroppedImageComplete (p0, p1, p2);
	}

	private native void n_onGetCroppedImageComplete (com.theartofdev.edmodo.cropper.CropImageView p0, android.graphics.Bitmap p1, java.lang.Exception p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
