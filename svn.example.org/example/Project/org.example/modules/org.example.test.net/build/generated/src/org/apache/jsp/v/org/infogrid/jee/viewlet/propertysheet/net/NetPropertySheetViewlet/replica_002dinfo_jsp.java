package org.apache.jsp.v.org.infogrid.jee.viewlet.propertysheet.net.NetPropertySheetViewlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class replica_002dinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write(" <table class=\"replica\">\n");
      out.write("  <thead>\n");
      out.write("   <tr>\n");
      out.write("    <th colspan=\"2\">Replication Info</th>\n");
      out.write("   </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>   \n");
      out.write("   <tr>\n");
      out.write("    <td colspan=\"2\">\n");
      out.write("     <span class=\"infobit\">Is&nbsp;home&nbsp;replica:&nbsp;\n");
      out.write("      <netmesh:ifHomeReplica meshObjectName=\"Subject\">Yes.</netmesh:ifHomeReplica>\n");
      out.write("      <netmesh:notIfHomeReplica meshObjectName=\"Subject\">No.</netmesh:notIfHomeReplica></span>\n");
      out.write("     <span class=\"infobit\">Has&nbsp;update&nbsp;rights:&nbsp;\n");
      out.write("      <netmesh:ifHasLock meshObjectName=\"Subject\">Yes.</netmesh:ifHasLock>\n");
      out.write("      <netmesh:notIfHasLock meshObjectName=\"Subject\">No.</netmesh:notIfHasLock></span>\n");
      out.write("     <span class=\"infobit\">Will&nbsp;give&nbsp;up&nbsp;lock:&nbsp;\n");
      out.write("      <netmesh:ifWillGiveUpLock meshObjectName=\"Subject\">Yes.</netmesh:ifWillGiveUpLock>\n");
      out.write("      <netmesh:notIfWillGiveUpLock meshObjectName=\"Subject\">No.</netmesh:notIfWillGiveUpLock></span>\n");
      out.write("    </td>\n");
      out.write("   </tr>\n");
      out.write("   <tr>\n");
      out.write("    <netmesh:ifMeshObjectHasProxies meshObjectName=\"Subject\" min=\"1\">\n");
      out.write("     <td width=\"33%\">\n");
      out.write("      Proxies towards:\n");
      out.write("     </td>\n");
      out.write("     <td>\n");
      out.write("      <ul>\n");
      out.write("       <netmeshbase:proxyIterate meshObjectName=\"Subject\" loopVar=\"currentProxy\">\n");
      out.write("        <li>\n");
      out.write("         <netmeshbase:proxyLink proxyName=\"currentProxy\"><netmeshbase:proxy proxyName=\"currentProxy\" /></netmeshbase:proxyLink>\n");
      out.write("        </li>\n");
      out.write("       </netmeshbase:proxyIterate>\n");
      out.write("      </ul>\n");
      out.write("     </td>\n");
      out.write("    </netmesh:ifMeshObjectHasProxies>\n");
      out.write("    <netmesh:ifMeshObjectHasProxies meshObjectName=\"Subject\" max=\"0\">\n");
      out.write("     <td colspan=\"2\" style=\"text-align: center\">No Proxies.</td>\n");
      out.write("    </netmesh:ifMeshObjectHasProxies>\n");
      out.write("   </tr>\n");
      out.write("  </tbody>\n");
      out.write(" </table>\n");
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
}
