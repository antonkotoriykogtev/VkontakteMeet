package md569cfc41c7360b0fc315cca19bb7c27f7;


public class AndroidFacebookService
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.facebook.GraphRequest.GraphJSONObjectCallback,
		com.facebook.GraphRequest.Callback,
		com.facebook.FacebookCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCompleted:(Lorg/json/JSONObject;Lcom/facebook/GraphResponse;)V:GetOnCompleted_Lorg_json_JSONObject_Lcom_facebook_GraphResponse_Handler:Xamarin.Facebook.GraphRequest/IGraphJSONObjectCallbackInvoker, Xamarin.Facebook.Core.Android\n" +
			"n_onCompleted:(Lcom/facebook/GraphResponse;)V:GetOnCompleted_Lcom_facebook_GraphResponse_Handler:Xamarin.Facebook.GraphRequest/ICallbackInvoker, Xamarin.Facebook.Core.Android\n" +
			"n_onCancel:()V:GetOnCancelHandler:Xamarin.Facebook.IFacebookCallbackInvoker, Xamarin.Facebook.Common.Android\n" +
			"n_onError:(Lcom/facebook/FacebookException;)V:GetOnError_Lcom_facebook_FacebookException_Handler:Xamarin.Facebook.IFacebookCallbackInvoker, Xamarin.Facebook.Common.Android\n" +
			"n_onSuccess:(Ljava/lang/Object;)V:GetOnSuccess_Ljava_lang_Object_Handler:Xamarin.Facebook.IFacebookCallbackInvoker, Xamarin.Facebook.Common.Android\n" +
			"";
		mono.android.Runtime.register ("Login.Droid.AndroidFacebookService, Login.Droid", AndroidFacebookService.class, __md_methods);
	}


	public AndroidFacebookService ()
	{
		super ();
		if (getClass () == AndroidFacebookService.class)
			mono.android.TypeManager.Activate ("Login.Droid.AndroidFacebookService, Login.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCompleted (org.json.JSONObject p0, com.facebook.GraphResponse p1)
	{
		n_onCompleted (p0, p1);
	}

	private native void n_onCompleted (org.json.JSONObject p0, com.facebook.GraphResponse p1);


	public void onCompleted (com.facebook.GraphResponse p0)
	{
		n_onCompleted (p0);
	}

	private native void n_onCompleted (com.facebook.GraphResponse p0);


	public void onCancel ()
	{
		n_onCancel ();
	}

	private native void n_onCancel ();


	public void onError (com.facebook.FacebookException p0)
	{
		n_onError (p0);
	}

	private native void n_onError (com.facebook.FacebookException p0);


	public void onSuccess (java.lang.Object p0)
	{
		n_onSuccess (p0);
	}

	private native void n_onSuccess (java.lang.Object p0);

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
