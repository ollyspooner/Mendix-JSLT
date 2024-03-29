package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(jslt.actions.JSLT.class);
    registrator.registerUserAction(jslt.actions.JSLT_WithObjectFilter.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
