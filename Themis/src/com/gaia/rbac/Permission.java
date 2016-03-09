package com.gaia.rbac;

public interface Permission {
	boolean isPermitted(Grantee grantee);
}
