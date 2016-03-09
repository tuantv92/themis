package com.gaia.rbac;

import java.util.Collection;

import com.gaia.rbac.anotation.RequiredPermission;

public interface Action {

	PermissionManager getPermissionManager();

	default boolean isPermitted(Grantee grantee) {
		try {
			if (this.getClass().isAnnotationPresent(RequiredPermission.class)) {
				RequiredPermission requiredPermission = this.getClass().getAnnotation(RequiredPermission.class);
				String[] permissionNames = requiredPermission.value();
				Collection<Permission> permissions = this.getPermissionManager().getPermissionForNames(permissionNames);
				for (Permission permission : permissions) {
					if (!permission.isPermitted(grantee)) {
						return false;
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return true;
	}

	void execute(Grantee grantee);
}
