package org.apache.jsp.v.org.infogrid.jee.viewlet.propertysheet.PropertySheetViewlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class attributes_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" <table class=\"attributes\">\n");
      out.write("  <thead>\n");
      out.write("   <tr>\n");
      out.write("    <th class=\"type\">\n");
      out.write("     <v:ifState viewletState=\"edit\">\n");
      out.write("      <div class=\"slide-in-button\"><a href=\"javascript:overlay_show( 'org-infogrid-jee-shell-http-HttpShellVerb-bless', { 'shell.subject' : '<mesh:meshObjectId meshObjectName=\"Subject\" stringRepresentation=\"Plain\" filter=\"true\" />' } )\" title=\"Bless this MeshObject\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/s/images/add.png\" alt=\"Add type\"/></a></div>\n");
      out.write("     </v:ifState>\n");
      out.write("     Type\n");
      out.write("    </th>\n");
      out.write("    <th>Property</th>\n");
      out.write("    <th>Value</th>\n");
      out.write("   </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("   <mesh:blessedByIterate meshObjectName=\"Subject\" blessedByLoopVar=\"blessedBy\">\n");
      out.write("    <tr>\n");
      out.write("     <th class=\"entityType\" colspan=\"3\">\n");
      out.write("      <v:ifState viewletState=\"edit\">\n");
      out.write("       <div class=\"slide-in-button\"><a href=\"javascript:overlay_show( 'org-infogrid-jee-shell-http-HttpShellVerb-unbless', { 'shell.subject' : '<mesh:meshObjectId meshObjectName=\"Subject\" stringRepresentation=\"Plain\" filter=\"true\" />', 'shell.subject.unbless' : '<mesh:meshTypeId meshTypeName=\"blessedBy\" stringRepresentation=\"Plain\" filter=\"true\" />' } )\" title=\"Unbless this MeshObject\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/s/images/trash.png\" alt=\"Delete\"/></a></div>\n");
      out.write("      </v:ifState>\n");
      out.write("      <mesh:type meshTypeName=\"blessedBy\"/>\n");
      out.write("     </th>\n");
      out.write("    </tr>\n");
      out.write("    <mesh:propertyIterate meshObjectName=\"Subject\" meshTypeName=\"blessedBy\" propertyTypeLoopVar=\"propertyType\" propertyValueLoopVar=\"propertyValue\" skipNullProperty=\"false\">\n");
      out.write("     <tr>\n");
      out.write("      <th class=\"type\"></th>\n");
      out.write("      <td class=\"name\"><mesh:type meshTypeName=\"propertyType\" /></td>\n");
      out.write("      <td class=\"value\">\n");
      out.write("       <mesh:property meshObjectName=\"Subject\" propertyTypeName=\"propertyType\" ignore=\"true\" state=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Viewlet.viewletState.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("      </td>\n");
      out.write("     </tr>\n");
      out.write("    </mesh:propertyIterate>\n");
      out.write("   </mesh:blessedByIterate>\n");
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
