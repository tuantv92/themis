package com.gaia.rbac.entity;

import java.util.Collection;

import com.gaia.rbac.Grantee;

public interface RBACUser extends Grantee {

	Collection<RBACRole> getRoles();
}
