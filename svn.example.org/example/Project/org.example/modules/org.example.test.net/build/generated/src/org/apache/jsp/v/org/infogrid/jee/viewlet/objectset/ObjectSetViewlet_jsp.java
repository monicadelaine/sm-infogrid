package org.apache.jsp.v.org.infogrid.jee.viewlet.objectset;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ObjectSetViewlet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_meshObjectLink_meshObjectName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_objectset_iteratenocontent;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tmpl_stylesheet_href_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewlet;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_objectset_iteratecontentrow;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_propertyValue_propertyValueName_ignore_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_objectset_iterate_meshObjectSetName_loopVar_ignore;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_type_meshTypeName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewletAlternatives_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_meshObjectLink_meshObjectName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_objectset_iteratenocontent = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tmpl_stylesheet_href_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewlet = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_objectset_iteratecontentrow = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_propertyValue_propertyValueName_ignore_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_objectset_iterate_meshObjectSetName_loopVar_ignore = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_type_meshTypeName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewletAlternatives_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.release();
    _jspx_tagPool_mesh_meshObjectLink_meshObjectName.release();
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody.release();
    _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.release();
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody.release();
    _jspx_tagPool_objectset_iteratenocontent.release();
    _jspx_tagPool_tmpl_stylesheet_href_nobody.release();
    _jspx_tagPool_v_viewlet.release();
    _jspx_tagPool_objectset_iteratecontentrow.release();
    _jspx_tagPool_mesh_propertyValue_propertyValueName_ignore_nobody.release();
    _jspx_tagPool_objectset_iterate_meshObjectSetName_loopVar_ignore.release();
    _jspx_tagPool_mesh_type_meshTypeName_nobody.release();
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
      if (_jspx_meth_v_viewletAlternatives_0(_jspx_page_context))
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
    _jspx_th_tmpl_stylesheet_0.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}/v/org/infogrid/jee/viewlet/objectset/ObjectSetViewlet.css", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_tmpl_stylesheet_0 = _jspx_th_tmpl_stylesheet_0.doStartTag();
    if (_jspx_th_tmpl_stylesheet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tmpl_stylesheet_href_nobody.reuse(_jspx_th_tmpl_stylesheet_0);
      return true;
    }
    _jspx_tagPool_tmpl_stylesheet_href_nobody.reuse(_jspx_th_tmpl_stylesheet_0);
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
        out.write(" <h1>ObjectSet found related to: ");
        if (_jspx_meth_mesh_meshObjectId_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("</h1>\n");
        out.write(" <table class=\"objects\">\n");
        out.write("  <tbody>\n");
        out.write("   ");
        if (_jspx_meth_objectset_iterate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("  </tbody>\n");
        out.write(" </table> \n");
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

  private boolean _jspx_meth_mesh_meshObjectId_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshObjectId
    org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag _jspx_th_mesh_meshObjectId_0 = (org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag) _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody.get(org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag.class);
    _jspx_th_mesh_meshObjectId_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshObjectId_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_mesh_meshObjectId_0.setMeshObjectName("Subject");
    _jspx_th_mesh_meshObjectId_0.setStringRepresentation("Html");
    _jspx_th_mesh_meshObjectId_0.setMaxLength(30);
    int _jspx_eval_mesh_meshObjectId_0 = _jspx_th_mesh_meshObjectId_0.doStartTag();
    if (_jspx_th_mesh_meshObjectId_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody.reuse(_jspx_th_mesh_meshObjectId_0);
      return true;
    }
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody.reuse(_jspx_th_mesh_meshObjectId_0);
    return false;
  }

  private boolean _jspx_meth_objectset_iterate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  objectset:iterate
    org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateTag _jspx_th_objectset_iterate_0 = (org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateTag) _jspx_tagPool_objectset_iterate_meshObjectSetName_loopVar_ignore.get(org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateTag.class);
    _jspx_th_objectset_iterate_0.setPageContext(_jspx_page_context);
    _jspx_th_objectset_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_objectset_iterate_0.setMeshObjectSetName("Viewlet.viewedMeshObjects.reachedObjects");
    _jspx_th_objectset_iterate_0.setLoopVar("current");
    _jspx_th_objectset_iterate_0.setIgnore("true");
    int _jspx_eval_objectset_iterate_0 = _jspx_th_objectset_iterate_0.doStartTag();
    if (_jspx_eval_objectset_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_objectset_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_objectset_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_objectset_iterate_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_objectset_iteratecontentrow_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_objectset_iterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_objectset_iteratenocontent_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_objectset_iterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        int evalDoAfterBody = _jspx_th_objectset_iterate_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_objectset_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_objectset_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_objectset_iterate_meshObjectSetName_loopVar_ignore.reuse(_jspx_th_objectset_iterate_0);
      return true;
    }
    _jspx_tagPool_objectset_iterate_meshObjectSetName_loopVar_ignore.reuse(_jspx_th_objectset_iterate_0);
    return false;
  }

  private boolean _jspx_meth_objectset_iteratecontentrow_0(javax.servlet.jsp.tagext.JspTag _jspx_th_objectset_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  objectset:iteratecontentrow
    org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateContentRowTag _jspx_th_objectset_iteratecontentrow_0 = (org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateContentRowTag) _jspx_tagPool_objectset_iteratecontentrow.get(org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateContentRowTag.class);
    _jspx_th_objectset_iteratecontentrow_0.setPageContext(_jspx_page_context);
    _jspx_th_objectset_iteratecontentrow_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_objectset_iterate_0);
    int _jspx_eval_objectset_iteratecontentrow_0 = _jspx_th_objectset_iteratecontentrow_0.doStartTag();
    if (_jspx_eval_objectset_iteratecontentrow_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_objectset_iteratecontentrow_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_objectset_iteratecontentrow_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_objectset_iteratecontentrow_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("     <tr class=\"identifier\">\n");
        out.write("      <th class=\"identifier\">Identifier:</th>\n");
        out.write("      <td class=\"type\" colspan=\"2\">");
        if (_jspx_meth_mesh_meshObjectLink_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_objectset_iteratecontentrow_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("     </tr>\n");
        out.write("     ");
        if (_jspx_meth_mesh_blessedByIterate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_objectset_iteratecontentrow_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_objectset_iteratecontentrow_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_objectset_iteratecontentrow_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_objectset_iteratecontentrow_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_objectset_iteratecontentrow.reuse(_jspx_th_objectset_iteratecontentrow_0);
      return true;
    }
    _jspx_tagPool_objectset_iteratecontentrow.reuse(_jspx_th_objectset_iteratecontentrow_0);
    return false;
  }

  private boolean _jspx_meth_mesh_meshObjectLink_0(javax.servlet.jsp.tagext.JspTag _jspx_th_objectset_iteratecontentrow_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshObjectLink
    org.infogrid.jee.taglib.mesh.MeshObjectLinkTag _jspx_th_mesh_meshObjectLink_0 = (org.infogrid.jee.taglib.mesh.MeshObjectLinkTag) _jspx_tagPool_mesh_meshObjectLink_meshObjectName.get(org.infogrid.jee.taglib.mesh.MeshObjectLinkTag.class);
    _jspx_th_mesh_meshObjectLink_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshObjectLink_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_objectset_iteratecontentrow_0);
    _jspx_th_mesh_meshObjectLink_0.setMeshObjectName("current");
    int _jspx_eval_mesh_meshObjectLink_0 = _jspx_th_mesh_meshObjectLink_0.doStartTag();
    if (_jspx_eval_mesh_meshObjectLink_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mesh_meshObjectLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mesh_meshObjectLink_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mesh_meshObjectLink_0.doInitBody();
      }
      do {
        if (_jspx_meth_mesh_meshObjectId_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_meshObjectLink_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_mesh_meshObjectLink_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mesh_meshObjectLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_mesh_meshObjectLink_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_meshObjectLink_meshObjectName.reuse(_jspx_th_mesh_meshObjectLink_0);
      return true;
    }
    _jspx_tagPool_mesh_meshObjectLink_meshObjectName.reuse(_jspx_th_mesh_meshObjectLink_0);
    return false;
  }

  private boolean _jspx_meth_mesh_meshObjectId_1(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_meshObjectLink_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshObjectId
    org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag _jspx_th_mesh_meshObjectId_1 = (org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag) _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody.get(org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag.class);
    _jspx_th_mesh_meshObjectId_1.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshObjectId_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_meshObjectLink_0);
    _jspx_th_mesh_meshObjectId_1.setMeshObjectName("current");
    _jspx_th_mesh_meshObjectId_1.setStringRepresentation("Plain");
    _jspx_th_mesh_meshObjectId_1.setFilter("true");
    _jspx_th_mesh_meshObjectId_1.setMaxLength(35);
    int _jspx_eval_mesh_meshObjectId_1 = _jspx_th_mesh_meshObjectId_1.doStartTag();
    if (_jspx_th_mesh_meshObjectId_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody.reuse(_jspx_th_mesh_meshObjectId_1);
      return true;
    }
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody.reuse(_jspx_th_mesh_meshObjectId_1);
    return false;
  }

  private boolean _jspx_meth_mesh_blessedByIterate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_objectset_iteratecontentrow_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:blessedByIterate
    org.infogrid.jee.taglib.mesh.MeshObjectBlessedByIterateTag _jspx_th_mesh_blessedByIterate_0 = (org.infogrid.jee.taglib.mesh.MeshObjectBlessedByIterateTag) _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.get(org.infogrid.jee.taglib.mesh.MeshObjectBlessedByIterateTag.class);
    _jspx_th_mesh_blessedByIterate_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_blessedByIterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_objectset_iteratecontentrow_0);
    _jspx_th_mesh_blessedByIterate_0.setMeshObjectName("current");
    _jspx_th_mesh_blessedByIterate_0.setBlessedByLoopVar("blessedBy");
    int _jspx_eval_mesh_blessedByIterate_0 = _jspx_th_mesh_blessedByIterate_0.doStartTag();
    if (_jspx_eval_mesh_blessedByIterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mesh_blessedByIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mesh_blessedByIterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mesh_blessedByIterate_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("      <tr>\n");
        out.write("       <th></th>\n");
        out.write("       <th class=\"type\" colspan=\"2\">\n");
        out.write("        ");
        if (_jspx_meth_mesh_type_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_blessedByIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("       </th>\n");
        out.write("      </tr>\n");
        out.write("      ");
        if (_jspx_meth_mesh_propertyIterate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_blessedByIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("     ");
        int evalDoAfterBody = _jspx_th_mesh_blessedByIterate_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mesh_blessedByIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_mesh_blessedByIterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.reuse(_jspx_th_mesh_blessedByIterate_0);
      return true;
    }
    _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.reuse(_jspx_th_mesh_blessedByIterate_0);
    return false;
  }

  private boolean _jspx_meth_mesh_type_0(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_blessedByIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:type
    org.infogrid.jee.taglib.mesh.MeshTypeTag _jspx_th_mesh_type_0 = (org.infogrid.jee.taglib.mesh.MeshTypeTag) _jspx_tagPool_mesh_type_meshTypeName_nobody.get(org.infogrid.jee.taglib.mesh.MeshTypeTag.class);
    _jspx_th_mesh_type_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_type_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_blessedByIterate_0);
    _jspx_th_mesh_type_0.setMeshTypeName("blessedBy");
    int _jspx_eval_mesh_type_0 = _jspx_th_mesh_type_0.doStartTag();
    if (_jspx_th_mesh_type_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_type_meshTypeName_nobody.reuse(_jspx_th_mesh_type_0);
      return true;
    }
    _jspx_tagPool_mesh_type_meshTypeName_nobody.reuse(_jspx_th_mesh_type_0);
    return false;
  }

  private boolean _jspx_meth_mesh_propertyIterate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_blessedByIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:propertyIterate
    org.infogrid.jee.taglib.mesh.MeshObjectPropertyIterateTag _jspx_th_mesh_propertyIterate_0 = (org.infogrid.jee.taglib.mesh.MeshObjectPropertyIterateTag) _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.get(org.infogrid.jee.taglib.mesh.MeshObjectPropertyIterateTag.class);
    _jspx_th_mesh_propertyIterate_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_propertyIterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_blessedByIterate_0);
    _jspx_th_mesh_propertyIterate_0.setMeshObjectName("current");
    _jspx_th_mesh_propertyIterate_0.setMeshTypeName("blessedBy");
    _jspx_th_mesh_propertyIterate_0.setPropertyTypeLoopVar("propertyType");
    _jspx_th_mesh_propertyIterate_0.setPropertyValueLoopVar("propertyValue");
    _jspx_th_mesh_propertyIterate_0.setSkipNullProperty(false);
    int _jspx_eval_mesh_propertyIterate_0 = _jspx_th_mesh_propertyIterate_0.doStartTag();
    if (_jspx_eval_mesh_propertyIterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mesh_propertyIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mesh_propertyIterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mesh_propertyIterate_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("       <tr>\n");
        out.write("        <th></th>\n");
        out.write("        <td class=\"type\">");
        if (_jspx_meth_mesh_type_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_propertyIterate_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("        <td class=\"value\">\n");
        out.write("         ");
        if (_jspx_meth_mesh_propertyValue_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_propertyIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        </td>\n");
        out.write("       </tr>\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_mesh_propertyIterate_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mesh_propertyIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_mesh_propertyIterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.reuse(_jspx_th_mesh_propertyIterate_0);
      return true;
    }
    _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.reuse(_jspx_th_mesh_propertyIterate_0);
    return false;
  }

  private boolean _jspx_meth_mesh_type_1(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_propertyIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:type
    org.infogrid.jee.taglib.mesh.MeshTypeTag _jspx_th_mesh_type_1 = (org.infogrid.jee.taglib.mesh.MeshTypeTag) _jspx_tagPool_mesh_type_meshTypeName_nobody.get(org.infogrid.jee.taglib.mesh.MeshTypeTag.class);
    _jspx_th_mesh_type_1.setPageContext(_jspx_page_context);
    _jspx_th_mesh_type_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_propertyIterate_0);
    _jspx_th_mesh_type_1.setMeshTypeName("propertyType");
    int _jspx_eval_mesh_type_1 = _jspx_th_mesh_type_1.doStartTag();
    if (_jspx_th_mesh_type_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_type_meshTypeName_nobody.reuse(_jspx_th_mesh_type_1);
      return true;
    }
    _jspx_tagPool_mesh_type_meshTypeName_nobody.reuse(_jspx_th_mesh_type_1);
    return false;
  }

  private boolean _jspx_meth_mesh_propertyValue_0(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_propertyIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:propertyValue
    org.infogrid.jee.taglib.mesh.PropertyValueTag _jspx_th_mesh_propertyValue_0 = (org.infogrid.jee.taglib.mesh.PropertyValueTag) _jspx_tagPool_mesh_propertyValue_propertyValueName_ignore_nobody.get(org.infogrid.jee.taglib.mesh.PropertyValueTag.class);
    _jspx_th_mesh_propertyValue_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_propertyValue_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_propertyIterate_0);
    _jspx_th_mesh_propertyValue_0.setPropertyValueName("propertyValue");
    _jspx_th_mesh_propertyValue_0.setIgnore("true");
    int _jspx_eval_mesh_propertyValue_0 = _jspx_th_mesh_propertyValue_0.doStartTag();
    if (_jspx_th_mesh_propertyValue_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_propertyValue_propertyValueName_ignore_nobody.reuse(_jspx_th_mesh_propertyValue_0);
      return true;
    }
    _jspx_tagPool_mesh_propertyValue_propertyValueName_ignore_nobody.reuse(_jspx_th_mesh_propertyValue_0);
    return false;
  }

  private boolean _jspx_meth_objectset_iteratenocontent_0(javax.servlet.jsp.tagext.JspTag _jspx_th_objectset_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  objectset:iteratenocontent
    org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateNoContentTag _jspx_th_objectset_iteratenocontent_0 = (org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateNoContentTag) _jspx_tagPool_objectset_iteratenocontent.get(org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateNoContentTag.class);
    _jspx_th_objectset_iteratenocontent_0.setPageContext(_jspx_page_context);
    _jspx_th_objectset_iteratenocontent_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_objectset_iterate_0);
    int _jspx_eval_objectset_iteratenocontent_0 = _jspx_th_objectset_iteratenocontent_0.doStartTag();
    if (_jspx_eval_objectset_iteratenocontent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("     <tr>\n");
        out.write("      <td>\n");
        out.write("       Empty set.\n");
        out.write("      </td>\n");
        out.write("     </tr>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_objectset_iteratenocontent_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_objectset_iteratenocontent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_objectset_iteratenocontent.reuse(_jspx_th_objectset_iteratenocontent_0);
      return true;
    }
    _jspx_tagPool_objectset_iteratenocontent.reuse(_jspx_th_objectset_iteratenocontent_0);
    return false;
  }
}
