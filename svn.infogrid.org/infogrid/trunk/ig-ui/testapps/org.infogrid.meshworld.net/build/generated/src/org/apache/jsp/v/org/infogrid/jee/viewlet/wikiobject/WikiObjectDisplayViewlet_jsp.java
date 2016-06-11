package org.apache.jsp.v.org.infogrid.jee.viewlet.wikiobject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WikiObjectDisplayViewlet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/v/org/infogrid/jee/taglib/mesh/set/set.tld");
    _jspx_dependants.add("/v/org/infogrid/jee/taglib/mesh/mesh.tld");
    _jspx_dependants.add("/v/org/infogrid/jee/taglib/candy/candy.tld");
    _jspx_dependants.add("/v/org/infogrid/jee/taglib/util/util.tld");
    _jspx_dependants.add("/v/org/infogrid/jee/taglib/viewlet/viewlet.tld");
    _jspx_dependants.add("/v/org/infogrid/jee/taglib/templates/templates.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_property_propertyType_meshObjectName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewlet;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tmpl_script_src_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tmpl_stylesheet_href_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewletAlternatives_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_mesh_property_propertyType_meshObjectName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewlet = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tmpl_script_src_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tmpl_stylesheet_href_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewletAlternatives_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_mesh_property_propertyType_meshObjectName_nobody.release();
    _jspx_tagPool_v_viewlet.release();
    _jspx_tagPool_tmpl_script_src_nobody.release();
    _jspx_tagPool_tmpl_stylesheet_href_nobody.release();
    _jspx_tagPool_v_viewletAlternatives_nobody.release();
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

      out.write('\n');
      if (_jspx_meth_tmpl_stylesheet_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_tmpl_stylesheet_1(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_tmpl_script_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_v_viewletAlternatives_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_v_viewlet_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_tmpl_stylesheet_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tmpl:stylesheet
    org.infogrid.jee.taglib.templates.StylesheetTag _jspx_th_tmpl_stylesheet_0 = (org.infogrid.jee.taglib.templates.StylesheetTag) _jspx_tagPool_tmpl_stylesheet_href_nobody.get(org.infogrid.jee.taglib.templates.StylesheetTag.class);
    _jspx_th_tmpl_stylesheet_0.setPageContext(_jspx_page_context);
    _jspx_th_tmpl_stylesheet_0.setParent(null);
    _jspx_th_tmpl_stylesheet_0.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}/v/org/infogrid/jee/viewlet/wikiobject/WikiObjectDisplayViewlet.css", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_tmpl_stylesheet_0 = _jspx_th_tmpl_stylesheet_0.doStartTag();
    if (_jspx_th_tmpl_stylesheet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tmpl_stylesheet_href_nobody.reuse(_jspx_th_tmpl_stylesheet_0);
      return true;
    }
    _jspx_tagPool_tmpl_stylesheet_href_nobody.reuse(_jspx_th_tmpl_stylesheet_0);
    return false;
  }

  private boolean _jspx_meth_tmpl_stylesheet_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tmpl:stylesheet
    org.infogrid.jee.taglib.templates.StylesheetTag _jspx_th_tmpl_stylesheet_1 = (org.infogrid.jee.taglib.templates.StylesheetTag) _jspx_tagPool_tmpl_stylesheet_href_nobody.get(org.infogrid.jee.taglib.templates.StylesheetTag.class);
    _jspx_th_tmpl_stylesheet_1.setPageContext(_jspx_page_context);
    _jspx_th_tmpl_stylesheet_1.setParent(null);
    _jspx_th_tmpl_stylesheet_1.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}/v/org/infogrid/jee/taglib/mesh/PropertyTag.css", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_tmpl_stylesheet_1 = _jspx_th_tmpl_stylesheet_1.doStartTag();
    if (_jspx_th_tmpl_stylesheet_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tmpl_stylesheet_href_nobody.reuse(_jspx_th_tmpl_stylesheet_1);
      return true;
    }
    _jspx_tagPool_tmpl_stylesheet_href_nobody.reuse(_jspx_th_tmpl_stylesheet_1);
    return false;
  }

  private boolean _jspx_meth_tmpl_script_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tmpl:script
    org.infogrid.jee.taglib.templates.ScriptTag _jspx_th_tmpl_script_0 = (org.infogrid.jee.taglib.templates.ScriptTag) _jspx_tagPool_tmpl_script_src_nobody.get(org.infogrid.jee.taglib.templates.ScriptTag.class);
    _jspx_th_tmpl_script_0.setPageContext(_jspx_page_context);
    _jspx_th_tmpl_script_0.setParent(null);
    _jspx_th_tmpl_script_0.setSrc((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}/v/org/infogrid/jee/taglib/mesh/PropertyTag.js", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_tmpl_script_0 = _jspx_th_tmpl_script_0.doStartTag();
    if (_jspx_th_tmpl_script_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tmpl_script_src_nobody.reuse(_jspx_th_tmpl_script_0);
      return true;
    }
    _jspx_tagPool_tmpl_script_src_nobody.reuse(_jspx_th_tmpl_script_0);
    return false;
  }

  private boolean _jspx_meth_v_viewletAlternatives_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:viewletAlternatives
    org.infogrid.jee.taglib.viewlet.ViewletAlternativesTag _jspx_th_v_viewletAlternatives_0 = (org.infogrid.jee.taglib.viewlet.ViewletAlternativesTag) _jspx_tagPool_v_viewletAlternatives_nobody.get(org.infogrid.jee.taglib.viewlet.ViewletAlternativesTag.class);
    _jspx_th_v_viewletAlternatives_0.setPageContext(_jspx_page_context);
    _jspx_th_v_viewletAlternatives_0.setParent(null);
    int _jspx_eval_v_viewletAlternatives_0 = _jspx_th_v_viewletAlternatives_0.doStartTag();
    if (_jspx_th_v_viewletAlternatives_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_viewletAlternatives_nobody.reuse(_jspx_th_v_viewletAlternatives_0);
      return true;
    }
    _jspx_tagPool_v_viewletAlternatives_nobody.reuse(_jspx_th_v_viewletAlternatives_0);
    return false;
  }

  private boolean _jspx_meth_v_viewlet_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:viewlet
    org.infogrid.jee.taglib.viewlet.ViewletTag _jspx_th_v_viewlet_0 = (org.infogrid.jee.taglib.viewlet.ViewletTag) _jspx_tagPool_v_viewlet.get(org.infogrid.jee.taglib.viewlet.ViewletTag.class);
    _jspx_th_v_viewlet_0.setPageContext(_jspx_page_context);
    _jspx_th_v_viewlet_0.setParent(null);
    int _jspx_eval_v_viewlet_0 = _jspx_th_v_viewlet_0.doStartTag();
    if (_jspx_eval_v_viewlet_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_v_viewlet_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_v_viewlet_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_v_viewlet_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write(" <div class=\"content\">\n");
        out.write("  ");
        if (_jspx_meth_mesh_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write(" </div>\n");
        int evalDoAfterBody = _jspx_th_v_viewlet_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_v_viewlet_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_v_viewlet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_viewlet.reuse(_jspx_th_v_viewlet_0);
      return true;
    }
    _jspx_tagPool_v_viewlet.reuse(_jspx_th_v_viewlet_0);
    return false;
  }

  private boolean _jspx_meth_mesh_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:property
    org.infogrid.jee.taglib.mesh.PropertyTag _jspx_th_mesh_property_0 = (org.infogrid.jee.taglib.mesh.PropertyTag) _jspx_tagPool_mesh_property_propertyType_meshObjectName_nobody.get(org.infogrid.jee.taglib.mesh.PropertyTag.class);
    _jspx_th_mesh_property_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_mesh_property_0.setMeshObjectName("Subject");
    _jspx_th_mesh_property_0.setPropertyType("org.infogrid.model.Wiki/WikiObject_Content");
    int _jspx_eval_mesh_property_0 = _jspx_th_mesh_property_0.doStartTag();
    if (_jspx_th_mesh_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_property_propertyType_meshObjectName_nobody.reuse(_jspx_th_mesh_property_0);
      return true;
    }
    _jspx_tagPool_mesh_property_propertyType_meshObjectName_nobody.reuse(_jspx_th_mesh_property_0);
    return false;
  }
}
