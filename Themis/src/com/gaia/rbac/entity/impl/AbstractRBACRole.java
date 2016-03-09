package com.gaia.rbac.entity.impl;

import java.util.Collection;
import java.util.HashSet;

import com.gaia.rbac.Permission;
import com.gaia.rbac.entity.RBACRole;

public abstract class AbstractRBACRole implements RBACRole {

	private final Collection<Permission> permissions = new HashSet<>();

	@Override
	public Collection<Permission> getPermissions() {
		return this.permissions;
	}

}
