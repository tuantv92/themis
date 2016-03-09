package com.gaia.rbac.entity;

import java.util.Collection;

import com.gaia.rbac.Grantee;
import com.gaia.rbac.Permission;

public interface RBACRole extends Grantee {

	Collection<Permission> getPermissions();
}
