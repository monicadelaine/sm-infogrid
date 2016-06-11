package org.apache.jsp.v.org.infogrid.jee.viewlet.wikiobject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WikiObjectEditViewlet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_property_propertyType_meshObjectName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_changeViewletState_viewletStates_display_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_ifState_viewletState;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tmpl_script_src_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_u_safeFormHiddenInput_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_property_stringRepresentation_propertyType_meshObjectName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tmpl_stylesheet_href_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewlet_formId;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewletAlternatives_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_mesh_property_propertyType_meshObjectName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_changeViewletState_viewletStates_display_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_ifState_viewletState = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tmpl_script_src_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_u_safeFormHiddenInput_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_property_stringRepresentation_propertyType_meshObjectName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tmpl_stylesheet_href_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewlet_formId = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewletAlternatives_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_mesh_property_propertyType_meshObjectName_nobody.release();
    _jspx_tagPool_v_changeViewletState_viewletStates_display_nobody.release();
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody.release();
    _jspx_tagPool_v_ifState_viewletState.release();
    _jspx_tagPool_tmpl_script_src_nobody.release();
    _jspx_tagPool_u_safeFormHiddenInput_nobody.release();
    _jspx_tagPool_mesh_property_stringRepresentation_propertyType_meshObjectName_nobody.release();
    _jspx_tagPool_tmpl_stylesheet_href_nobody.release();
    _jspx_tagPool_v_viewlet_formId.release();
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
      if (_jspx_meth_tmpl_stylesheet_2(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_tmpl_script_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_v_viewletAlternatives_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_v_changeViewletState_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_v_viewlet_0(_jspx_page_context))
        return;
      out.write('\n');
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
    _jspx_th_tmpl_stylesheet_0.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}/v/org/infogrid/jee/viewlet/wikiobject/WikiObjectEditViewlet.css", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_tmpl_stylesheet_1.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}/v/org/infogrid/jee/taglib/viewlet/ChangeViewletStateTag.css", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_tmpl_stylesheet_1 = _jspx_th_tmpl_stylesheet_1.doStartTag();
    if (_jspx_th_tmpl_stylesheet_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tmpl_stylesheet_href_nobody.reuse(_jspx_th_tmpl_stylesheet_1);
      return true;
    }
    _jspx_tagPool_tmpl_stylesheet_href_nobody.reuse(_jspx_th_tmpl_stylesheet_1);
    return false;
  }

  private boolean _jspx_meth_tmpl_stylesheet_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tmpl:stylesheet
    org.infogrid.jee.taglib.templates.StylesheetTag _jspx_th_tmpl_stylesheet_2 = (org.infogrid.jee.taglib.templates.StylesheetTag) _jspx_tagPool_tmpl_stylesheet_href_nobody.get(org.infogrid.jee.taglib.templates.StylesheetTag.class);
    _jspx_th_tmpl_stylesheet_2.setPageContext(_jspx_page_context);
    _jspx_th_tmpl_stylesheet_2.setParent(null);
    _jspx_th_tmpl_stylesheet_2.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}/v/org/infogrid/jee/taglib/mesh/PropertyTag.css", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_tmpl_stylesheet_2 = _jspx_th_tmpl_stylesheet_2.doStartTag();
    if (_jspx_th_tmpl_stylesheet_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tmpl_stylesheet_href_nobody.reuse(_jspx_th_tmpl_stylesheet_2);
      return true;
    }
    _jspx_tagPool_tmpl_stylesheet_href_nobody.reuse(_jspx_th_tmpl_stylesheet_2);
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

  private boolean _jspx_meth_v_changeViewletState_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:changeViewletState
    org.infogrid.jee.taglib.viewlet.ChangeViewletStateTag _jspx_th_v_changeViewletState_0 = (org.infogrid.jee.taglib.viewlet.ChangeViewletStateTag) _jspx_tagPool_v_changeViewletState_viewletStates_display_nobody.get(org.infogrid.jee.taglib.viewlet.ChangeViewletStateTag.class);
    _jspx_th_v_changeViewletState_0.setPageContext(_jspx_page_context);
    _jspx_th_v_changeViewletState_0.setParent(null);
    _jspx_th_v_changeViewletState_0.setViewletStates("edit");
    _jspx_th_v_changeViewletState_0.setDisplay("compact");
    int _jspx_eval_v_changeViewletState_0 = _jspx_th_v_changeViewletState_0.doStartTag();
    if (_jspx_th_v_changeViewletState_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_changeViewletState_viewletStates_display_nobody.reuse(_jspx_th_v_changeViewletState_0);
      return true;
    }
    _jspx_tagPool_v_changeViewletState_viewletStates_display_nobody.reuse(_jspx_th_v_changeViewletState_0);
    return false;
  }

  private boolean _jspx_meth_v_viewlet_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:viewlet
    org.infogrid.jee.taglib.viewlet.ViewletTag _jspx_th_v_viewlet_0 = (org.infogrid.jee.taglib.viewlet.ViewletTag) _jspx_tagPool_v_viewlet_formId.get(org.infogrid.jee.taglib.viewlet.ViewletTag.class);
    _jspx_th_v_viewlet_0.setPageContext(_jspx_page_context);
    _jspx_th_v_viewlet_0.setParent(null);
    _jspx_th_v_viewlet_0.setFormId("viewlet");
    int _jspx_eval_v_viewlet_0 = _jspx_th_v_viewlet_0.doStartTag();
    if (_jspx_eval_v_viewlet_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_v_viewlet_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_v_viewlet_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_v_viewlet_0.doInitBody();
      }
      do {
        out.write('\n');
        out.write(' ');
        if (_jspx_meth_v_ifState_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write(" <h1>Wiki Editor Viewlet for: ");
        if (_jspx_meth_mesh_meshObjectId_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("</h1>\n");
        out.write(" ");
        if (_jspx_meth_v_ifState_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        if (_jspx_meth_v_ifState_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_v_viewlet_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_v_viewlet_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_v_viewlet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_viewlet_formId.reuse(_jspx_th_v_viewlet_0);
      return true;
    }
    _jspx_tagPool_v_viewlet_formId.reuse(_jspx_th_v_viewlet_0);
    return false;
  }

  private boolean _jspx_meth_v_ifState_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:ifState
    org.infogrid.jee.taglib.viewlet.IfViewletStateTag _jspx_th_v_ifState_0 = (org.infogrid.jee.taglib.viewlet.IfViewletStateTag) _jspx_tagPool_v_ifState_viewletState.get(org.infogrid.jee.taglib.viewlet.IfViewletStateTag.class);
    _jspx_th_v_ifState_0.setPageContext(_jspx_page_context);
    _jspx_th_v_ifState_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_v_ifState_0.setViewletState("edit");
    int _jspx_eval_v_ifState_0 = _jspx_th_v_ifState_0.doStartTag();
    if (_jspx_eval_v_ifState_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("  <div class=\"viewlet-state\"><p>Edit mode (not saved yet)</p></div>\n");
        out.write(" ");
        int evalDoAfterBody = _jspx_th_v_ifState_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_v_ifState_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_ifState_viewletState.reuse(_jspx_th_v_ifState_0);
      return true;
    }
    _jspx_tagPool_v_ifState_viewletState.reuse(_jspx_th_v_ifState_0);
    return false;
  }

  private boolean _jspx_meth_mesh_meshObjectId_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshObjectId
    org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag _jspx_th_mesh_meshObjectId_0 = (org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag) _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody.get(org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag.class);
    _jspx_th_mesh_meshObjectId_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshObjectId_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_mesh_meshObjectId_0.setMeshObjectName("Subject");
    _jspx_th_mesh_meshObjectId_0.setStringRepresentation("Plain");
    _jspx_th_mesh_meshObjectId_0.setFilter("true");
    _jspx_th_mesh_meshObjectId_0.setMaxLength(30);
    int _jspx_eval_mesh_meshObjectId_0 = _jspx_th_mesh_meshObjectId_0.doStartTag();
    if (_jspx_th_mesh_meshObjectId_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody.reuse(_jspx_th_mesh_meshObjectId_0);
      return true;
    }
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody.reuse(_jspx_th_mesh_meshObjectId_0);
    return false;
  }

  private boolean _jspx_meth_v_ifState_1(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:ifState
    org.infogrid.jee.taglib.viewlet.IfViewletStateTag _jspx_th_v_ifState_1 = (org.infogrid.jee.taglib.viewlet.IfViewletStateTag) _jspx_tagPool_v_ifState_viewletState.get(org.infogrid.jee.taglib.viewlet.IfViewletStateTag.class);
    _jspx_th_v_ifState_1.setPageContext(_jspx_page_context);
    _jspx_th_v_ifState_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_v_ifState_1.setViewletState("edit");
    int _jspx_eval_v_ifState_1 = _jspx_th_v_ifState_1.doStartTag();
    if (_jspx_eval_v_ifState_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("  <div class=\"current-content\">\n");
        out.write("   ");
        if (_jspx_meth_mesh_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_ifState_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("  </div>\n");
        out.write("  <div class=\"dialog-buttons\">\n");
        out.write("   ");
        if (_jspx_meth_u_safeFormHiddenInput_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_ifState_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   <input id=\"shell.submit\" type=\"hidden\" name=\"shell.submit\" value=\"\" />\n");
        out.write("   <table class=\"dialog-buttons\">\n");
        out.write("    <tr>\n");
        out.write("     <td><button type=\"button\" name=\"ViewletStateTransition\" value=\"do-cancel\" class=\"cancel\" onclick=\"document.getElementById( 'shell.submit' ).value='cancel'; document.getElementById('viewlet').submit()\">Discard</button></td>\n");
        out.write("     <td><button type=\"button\" name=\"ViewletStateTransition\" value=\"do-commit\" class=\"commit\" onclick=\"document.getElementById( 'shell.submit' ).value='commit'; document.getElementById('viewlet').submit()\">Save</button></td>\n");
        out.write("    </tr>\n");
        out.write("   </table>\n");
        out.write("  </div>\n");
        out.write(" ");
        int evalDoAfterBody = _jspx_th_v_ifState_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_v_ifState_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_ifState_viewletState.reuse(_jspx_th_v_ifState_1);
      return true;
    }
    _jspx_tagPool_v_ifState_viewletState.reuse(_jspx_th_v_ifState_1);
    return false;
  }

  private boolean _jspx_meth_mesh_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_ifState_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:property
    org.infogrid.jee.taglib.mesh.PropertyTag _jspx_th_mesh_property_0 = (org.infogrid.jee.taglib.mesh.PropertyTag) _jspx_tagPool_mesh_property_stringRepresentation_propertyType_meshObjectName_nobody.get(org.infogrid.jee.taglib.mesh.PropertyTag.class);
    _jspx_th_mesh_property_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_ifState_1);
    _jspx_th_mesh_property_0.setMeshObjectName("Subject");
    _jspx_th_mesh_property_0.setPropertyType("org.infogrid.model.Wiki/WikiObject_Content");
    _jspx_th_mesh_property_0.setStringRepresentation("Edit");
    int _jspx_eval_mesh_property_0 = _jspx_th_mesh_property_0.doStartTag();
    if (_jspx_th_mesh_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_property_stringRepresentation_propertyType_meshObjectName_nobody.reuse(_jspx_th_mesh_property_0);
      return true;
    }
    _jspx_tagPool_mesh_property_stringRepresentation_propertyType_meshObjectName_nobody.reuse(_jspx_th_mesh_property_0);
    return false;
  }

  private boolean _jspx_meth_u_safeFormHiddenInput_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_ifState_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:safeFormHiddenInput
    org.infogrid.jee.taglib.util.SafeFormHiddenInputTag _jspx_th_u_safeFormHiddenInput_0 = (org.infogrid.jee.taglib.util.SafeFormHiddenInputTag) _jspx_tagPool_u_safeFormHiddenInput_nobody.get(org.infogrid.jee.taglib.util.SafeFormHiddenInputTag.class);
    _jspx_th_u_safeFormHiddenInput_0.setPageContext(_jspx_page_context);
    _jspx_th_u_safeFormHiddenInput_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_ifState_1);
    int _jspx_eval_u_safeFormHiddenInput_0 = _jspx_th_u_safeFormHiddenInput_0.doStartTag();
    if (_jspx_th_u_safeFormHiddenInput_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_safeFormHiddenInput_nobody.reuse(_jspx_th_u_safeFormHiddenInput_0);
      return true;
    }
    _jspx_tagPool_u_safeFormHiddenInput_nobody.reuse(_jspx_th_u_safeFormHiddenInput_0);
    return false;
  }

  private boolean _jspx_meth_v_ifState_2(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:ifState
    org.infogrid.jee.taglib.viewlet.IfViewletStateTag _jspx_th_v_ifState_2 = (org.infogrid.jee.taglib.viewlet.IfViewletStateTag) _jspx_tagPool_v_ifState_viewletState.get(org.infogrid.jee.taglib.viewlet.IfViewletStateTag.class);
    _jspx_th_v_ifState_2.setPageContext(_jspx_page_context);
    _jspx_th_v_ifState_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_v_ifState_2.setViewletState("view");
    int _jspx_eval_v_ifState_2 = _jspx_th_v_ifState_2.doStartTag();
    if (_jspx_eval_v_ifState_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("  <div class=\"content\">\n");
        out.write("   ");
        if (_jspx_meth_mesh_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_ifState_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("  </div>\n");
        out.write(" ");
        int evalDoAfterBody = _jspx_th_v_ifState_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_v_ifState_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_ifState_viewletState.reuse(_jspx_th_v_ifState_2);
      return true;
    }
    _jspx_tagPool_v_ifState_viewletState.reuse(_jspx_th_v_ifState_2);
    return false;
  }

  private boolean _jspx_meth_mesh_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_v_ifState_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:property
    org.infogrid.jee.taglib.mesh.PropertyTag _jspx_th_mesh_property_1 = (org.infogrid.jee.taglib.mesh.PropertyTag) _jspx_tagPool_mesh_property_propertyType_meshObjectName_nobody.get(org.infogrid.jee.taglib.mesh.PropertyTag.class);
    _jspx_th_mesh_property_1.setPageContext(_jspx_page_context);
    _jspx_th_mesh_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_ifState_2);
    _jspx_th_mesh_property_1.setMeshObjectName("Subject");
    _jspx_th_mesh_property_1.setPropertyType("org.infogrid.model.Wiki/WikiObject_Content");
    int _jspx_eval_mesh_property_1 = _jspx_th_mesh_property_1.doStartTag();
    if (_jspx_th_mesh_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_property_propertyType_meshObjectName_nobody.reuse(_jspx_th_mesh_property_1);
      return true;
    }
    _jspx_tagPool_mesh_property_propertyType_meshObjectName_nobody.reuse(_jspx_th_mesh_property_1);
    return false;
  }
}
