package com.themis.rbac;

import java.util.Collection;

public interface PermissionManager {
	void setup();

	Permission getPermissionForName(String name);

	Collection<Permission> getPermissionForNames(String... names);

	Collection<Permission> getPermissionForNames(Collection<String> names);
}
