package com.themis.rbac;

public interface Permission {

	void setUpRequiredPermissions();

	boolean isPermitted(Grantee grantee);

	String getName();
}
