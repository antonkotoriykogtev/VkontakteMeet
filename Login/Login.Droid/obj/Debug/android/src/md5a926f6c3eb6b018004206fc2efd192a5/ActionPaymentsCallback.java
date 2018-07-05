package md5a926f6c3eb6b018004206fc2efd192a5;


public class ActionPaymentsCallback
	extends com.vk.sdk.payments.VKPaymentsCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onUserState:(Z)V:GetOnUserState_ZHandler\n" +
			"";
		mono.android.Runtime.register ("VKontakte.Payments.ActionPaymentsCallback, VKontakte.Android", ActionPaymentsCallback.class, __md_methods);
	}


	public ActionPaymentsCallback ()
	{
		super ();
		if (getClass () == ActionPaymentsCallback.class)
			mono.android.TypeManager.Activate ("VKontakte.Payments.ActionPaymentsCallback, VKontakte.Android", "", this, new java.lang.Object[] {  });
	}


	public void onUserState (boolean p0)
	{
		n_onUserState (p0);
	}

	private native void n_onUserState (boolean p0);

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
