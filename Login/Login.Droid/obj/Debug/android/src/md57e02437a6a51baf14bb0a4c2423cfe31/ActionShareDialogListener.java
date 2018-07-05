package md57e02437a6a51baf14bb0a4c2423cfe31;


public class ActionShareDialogListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.vk.sdk.dialogs.VKShareDialog.VKShareDialogListener,
		com.vk.sdk.dialogs.VKShareDialogBuilder.VKShareDialogListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onVkShareCancel:()V:GetOnVkShareCancelHandler:VKontakte.Dialogs.VKShareDialogBuilder/IVKShareDialogListenerInvoker, VKontakte.Android\n" +
			"n_onVkShareComplete:(I)V:GetOnVkShareComplete_IHandler:VKontakte.Dialogs.VKShareDialogBuilder/IVKShareDialogListenerInvoker, VKontakte.Android\n" +
			"n_onVkShareError:(Lcom/vk/sdk/api/VKError;)V:GetOnVkShareError_Lcom_vk_sdk_api_VKError_Handler:VKontakte.Dialogs.VKShareDialogBuilder/IVKShareDialogListenerInvoker, VKontakte.Android\n" +
			"";
		mono.android.Runtime.register ("VKontakte.Dialogs.ActionShareDialogListener, VKontakte.Android", ActionShareDialogListener.class, __md_methods);
	}


	public ActionShareDialogListener ()
	{
		super ();
		if (getClass () == ActionShareDialogListener.class)
			mono.android.TypeManager.Activate ("VKontakte.Dialogs.ActionShareDialogListener, VKontakte.Android", "", this, new java.lang.Object[] {  });
	}


	public void onVkShareCancel ()
	{
		n_onVkShareCancel ();
	}

	private native void n_onVkShareCancel ();


	public void onVkShareComplete (int p0)
	{
		n_onVkShareComplete (p0);
	}

	private native void n_onVkShareComplete (int p0);


	public void onVkShareError (com.vk.sdk.api.VKError p0)
	{
		n_onVkShareError (p0);
	}

	private native void n_onVkShareError (com.vk.sdk.api.VKError p0);

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
