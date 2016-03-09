import com.themis.rbac.Grantee;
import com.themis.rbac.PermissionManager;
import com.themis.rbac.action.impl.AbstractAction;
import com.themis.rbac.anotation.RequiredPermission;

@RequiredPermission({ "view_user_info", "" })
public class ViewUserInfoAction extends AbstractAction {

	public ViewUserInfoAction(PermissionManager manager, Object data) {
		super(manager);
	}

	@Override
	protected void _execute(Grantee grantee) {
		Object user = null;
		create(user);
	}

	public void create(Object user) {

	}
}
