// Generated code from Butter Knife. Do not modify!
package welove520.com.photocategory;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.setToolbar(Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class));
    target.setRvPhoto(Utils.findRequiredViewAsType(source, R.id.rv_photo, "field 'rvPhoto'", RecyclerView.class));
    target.setFab(Utils.findRequiredViewAsType(source, R.id.fab, "field 'fab'", FloatingActionButton.class));
    target.setNavigationView(Utils.findRequiredViewAsType(source, R.id.nav_view, "field 'navigationView'", NavigationView.class));
    target.setDrawer(Utils.findRequiredViewAsType(source, R.id.drawer_layout, "field 'drawer'", DrawerLayout.class));
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.setToolbar(null);
    target.setRvPhoto(null);
    target.setFab(null);
    target.setNavigationView(null);
    target.setDrawer(null);
  }
}