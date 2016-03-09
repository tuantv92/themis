package com.gaia.rbac.entity.impl;

import java.util.Collection;
import java.util.HashSet;

import com.gaia.rbac.entity.RBACRole;
import com.gaia.rbac.entity.RBACUser;

public class AbstractRBACUser implements RBACUser {

	private final Collection<RBACRole> roles = new HashSet<>();

	@Override
	public Collection<RBACRole> getRoles() {
		return this.roles;
	}

}
