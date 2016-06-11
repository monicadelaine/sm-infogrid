package org.apache.jsp.v.org.infogrid.jee.viewlet.propertysheet.PropertySheetViewlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class audit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_timeRead_meshObjectName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_timeCreated_meshObjectName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_timeUpdated_meshObjectName_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_mesh_timeRead_meshObjectName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_timeCreated_meshObjectName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_timeUpdated_meshObjectName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_mesh_timeRead_meshObjectName_nobody.release();
    _jspx_tagPool_mesh_timeCreated_meshObjectName_nobody.release();
    _jspx_tagPool_mesh_timeUpdated_meshObjectName_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write(" <div class=\"audit\">\n");
      out.write("  <table>\n");
      out.write("   <tr>\n");
      out.write("    <td class=\"label\">Created:</td>\n");
      out.write("    <td>");
      if (_jspx_meth_mesh_timeCreated_0(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("   </tr>\n");
      out.write("   <tr>\n");
      out.write("    <td class=\"label\">Updated:</td>\n");
      out.write("    <td>");
      if (_jspx_meth_mesh_timeUpdated_0(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("   </tr>\n");
      out.write("   <tr>\n");
      out.write("    <td class=\"label\">Last&nbsp;read:</td>\n");
      out.write("    <td>");
      if (_jspx_meth_mesh_timeRead_0(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("   </tr>\n");
      out.write("  </table>\n");
      out.write(" </div>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_mesh_timeCreated_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:timeCreated
    org.infogrid.jee.taglib.mesh.MeshObjectTimeCreatedTag _jspx_th_mesh_timeCreated_0 = (org.infogrid.jee.taglib.mesh.MeshObjectTimeCreatedTag) _jspx_tagPool_mesh_timeCreated_meshObjectName_nobody.get(org.infogrid.jee.taglib.mesh.MeshObjectTimeCreatedTag.class);
    _jspx_th_mesh_timeCreated_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_timeCreated_0.setParent(null);
    _jspx_th_mesh_timeCreated_0.setMeshObjectName("Subject");
    int _jspx_eval_mesh_timeCreated_0 = _jspx_th_mesh_timeCreated_0.doStartTag();
    if (_jspx_th_mesh_timeCreated_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_timeCreated_meshObjectName_nobody.reuse(_jspx_th_mesh_timeCreated_0);
      return true;
    }
    _jspx_tagPool_mesh_timeCreated_meshObjectName_nobody.reuse(_jspx_th_mesh_timeCreated_0);
    return false;
  }

  private boolean _jspx_meth_mesh_timeUpdated_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:timeUpdated
    org.infogrid.jee.taglib.mesh.MeshObjectTimeUpdatedTag _jspx_th_mesh_timeUpdated_0 = (org.infogrid.jee.taglib.mesh.MeshObjectTimeUpdatedTag) _jspx_tagPool_mesh_timeUpdated_meshObjectName_nobody.get(org.infogrid.jee.taglib.mesh.MeshObjectTimeUpdatedTag.class);
    _jspx_th_mesh_timeUpdated_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_timeUpdated_0.setParent(null);
    _jspx_th_mesh_timeUpdated_0.setMeshObjectName("Subject");
    int _jspx_eval_mesh_timeUpdated_0 = _jspx_th_mesh_timeUpdated_0.doStartTag();
    if (_jspx_th_mesh_timeUpdated_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_timeUpdated_meshObjectName_nobody.reuse(_jspx_th_mesh_timeUpdated_0);
      return true;
    }
    _jspx_tagPool_mesh_timeUpdated_meshObjectName_nobody.reuse(_jspx_th_mesh_timeUpdated_0);
    return false;
  }

  private boolean _jspx_meth_mesh_timeRead_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:timeRead
    org.infogrid.jee.taglib.mesh.MeshObjectTimeReadTag _jspx_th_mesh_timeRead_0 = (org.infogrid.jee.taglib.mesh.MeshObjectTimeReadTag) _jspx_tagPool_mesh_timeRead_meshObjectName_nobody.get(org.infogrid.jee.taglib.mesh.MeshObjectTimeReadTag.class);
    _jspx_th_mesh_timeRead_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_timeRead_0.setParent(null);
    _jspx_th_mesh_timeRead_0.setMeshObjectName("Subject");
    int _jspx_eval_mesh_timeRead_0 = _jspx_th_mesh_timeRead_0.doStartTag();
    if (_jspx_th_mesh_timeRead_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_timeRead_meshObjectName_nobody.reuse(_jspx_th_mesh_timeRead_0);
      return true;
    }
    _jspx_tagPool_mesh_timeRead_meshObjectName_nobody.reuse(_jspx_th_mesh_timeRead_0);
    return false;
  }
}
