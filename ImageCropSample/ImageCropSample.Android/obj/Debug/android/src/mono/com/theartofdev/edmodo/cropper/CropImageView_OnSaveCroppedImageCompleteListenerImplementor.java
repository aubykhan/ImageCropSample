package mono.com.theartofdev.edmodo.cropper;


public class CropImageView_OnSaveCroppedImageCompleteListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.theartofdev.edmodo.cropper.CropImageView.OnSaveCroppedImageCompleteListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSaveCroppedImageComplete:(Lcom/theartofdev/edmodo/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V:GetOnSaveCroppedImageComplete_Lcom_theartofdev_edmodo_cropper_CropImageView_Landroid_net_Uri_Ljava_lang_Exception_Handler:Com.Theartofdev.Edmodo.Cropper.CropImageView/IOnSaveCroppedImageCompleteListenerInvoker, Xam.Plugins.ImageCropper.Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Theartofdev.Edmodo.Cropper.CropImageView+IOnSaveCroppedImageCompleteListenerImplementor, Xam.Plugins.ImageCropper.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CropImageView_OnSaveCroppedImageCompleteListenerImplementor.class, __md_methods);
	}


	public CropImageView_OnSaveCroppedImageCompleteListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CropImageView_OnSaveCroppedImageCompleteListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Theartofdev.Edmodo.Cropper.CropImageView+IOnSaveCroppedImageCompleteListenerImplementor, Xam.Plugins.ImageCropper.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onSaveCroppedImageComplete (com.theartofdev.edmodo.cropper.CropImageView p0, android.net.Uri p1, java.lang.Exception p2)
	{
		n_onSaveCroppedImageComplete (p0, p1, p2);
	}

	private native void n_onSaveCroppedImageComplete (com.theartofdev.edmodo.cropper.CropImageView p0, android.net.Uri p1, java.lang.Exception p2);

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
