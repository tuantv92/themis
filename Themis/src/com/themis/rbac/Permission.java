package com.themis.rbac;

public interface Permission {
	boolean isPermitted(Grantee grantee);
}
