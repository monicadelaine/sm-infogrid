package org.apache.jsp.v.org.infogrid.jee.viewlet.graphtree;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GraphTreeViewlet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/v/org/infogrid/jee/taglib/mesh/tree/tree.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tree_treeIterate_traversalSpecification_traversalPathLoopVar_startObjectName_meshObjectLoopVar_levelVar;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tmpl_stylesheet_href_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_set_iteratecontentrow;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewlet_formId;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_meshObject_meshObjectName_maxLength_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_includeViewlet_requestContext_reachedByName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_meshObjectLink_traversalPathName_meshObjectName_addArguments;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tree_up;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_ifIsReachedObject_object;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_set_pathIterate_traversalPathSetName_loopVar;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_ifIsReachedObject_traversalPath;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tree_nodeBefore;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewletAlternatives_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tree_down;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_tree_treeIterate_traversalSpecification_traversalPathLoopVar_startObjectName_meshObjectLoopVar_levelVar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tmpl_stylesheet_href_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_set_iteratecontentrow = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewlet_formId = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_meshObject_meshObjectName_maxLength_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_includeViewlet_requestContext_reachedByName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_meshObjectLink_traversalPathName_meshObjectName_addArguments = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tree_up = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_ifIsReachedObject_object = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_set_pathIterate_traversalPathSetName_loopVar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_ifIsReachedObject_traversalPath = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tree_nodeBefore = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewletAlternatives_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tree_down = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_tree_treeIterate_traversalSpecification_traversalPathLoopVar_startObjectName_meshObjectLoopVar_levelVar.release();
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody.release();
    _jspx_tagPool_tmpl_stylesheet_href_nobody.release();
    _jspx_tagPool_set_iteratecontentrow.release();
    _jspx_tagPool_v_viewlet_formId.release();
    _jspx_tagPool_mesh_meshObject_meshObjectName_maxLength_nobody.release();
    _jspx_tagPool_v_includeViewlet_requestContext_reachedByName_nobody.release();
    _jspx_tagPool_mesh_meshObjectLink_traversalPathName_meshObjectName_addArguments.release();
    _jspx_tagPool_tree_up.release();
    _jspx_tagPool_v_ifIsReachedObject_object.release();
    _jspx_tagPool_set_pathIterate_traversalPathSetName_loopVar.release();
    _jspx_tagPool_v_ifIsReachedObject_traversalPath.release();
    _jspx_tagPool_tree_nodeBefore.release();
    _jspx_tagPool_v_viewletAlternatives_nobody.release();
    _jspx_tagPool_tree_down.release();
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
    _jspx_th_tmpl_stylesheet_0.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}/v/org/infogrid/jee/viewlet/graphtree/GraphTreeViewlet.css", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
        out.write("\n");
        out.write(" <h1>Graph Tree for: ");
        if (_jspx_meth_mesh_meshObjectId_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("</h1>\n");
        out.write("\n");
        out.write(" <div class=\"content\">\n");
        out.write("  <div class=\"org-infogrid-jee-viewlet-graphtree-GraphTreeViewlet-content\">\n");
        out.write("   ");
        if (_jspx_meth_set_pathIterate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("  </div>\n");
        out.write("  <div class=\"org-infogrid-jee-viewlet-graphtree-GraphTreeViewlet-sidebar\">\n");
        out.write("   <dl class=\"level1\">\n");
        out.write("    ");
        if (_jspx_meth_tree_treeIterate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   </dl>\n");
        out.write("  </div>\n");
        out.write(" </div>\n");
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

  private boolean _jspx_meth_set_pathIterate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  set:pathIterate
    org.infogrid.jee.taglib.mesh.set.TraversalPathSetIterateTag _jspx_th_set_pathIterate_0 = (org.infogrid.jee.taglib.mesh.set.TraversalPathSetIterateTag) _jspx_tagPool_set_pathIterate_traversalPathSetName_loopVar.get(org.infogrid.jee.taglib.mesh.set.TraversalPathSetIterateTag.class);
    _jspx_th_set_pathIterate_0.setPageContext(_jspx_page_context);
    _jspx_th_set_pathIterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_set_pathIterate_0.setTraversalPathSetName("Viewlet.viewedMeshObjects.traversalPathSet");
    _jspx_th_set_pathIterate_0.setLoopVar("path");
    int _jspx_eval_set_pathIterate_0 = _jspx_th_set_pathIterate_0.doStartTag();
    if (_jspx_eval_set_pathIterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_set_pathIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_set_pathIterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_set_pathIterate_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_set_iteratecontentrow_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_set_pathIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        int evalDoAfterBody = _jspx_th_set_pathIterate_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_set_pathIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_set_pathIterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_set_pathIterate_traversalPathSetName_loopVar.reuse(_jspx_th_set_pathIterate_0);
      return true;
    }
    _jspx_tagPool_set_pathIterate_traversalPathSetName_loopVar.reuse(_jspx_th_set_pathIterate_0);
    return false;
  }

  private boolean _jspx_meth_set_iteratecontentrow_0(javax.servlet.jsp.tagext.JspTag _jspx_th_set_pathIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  set:iteratecontentrow
    org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateContentRowTag _jspx_th_set_iteratecontentrow_0 = (org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateContentRowTag) _jspx_tagPool_set_iteratecontentrow.get(org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateContentRowTag.class);
    _jspx_th_set_iteratecontentrow_0.setPageContext(_jspx_page_context);
    _jspx_th_set_iteratecontentrow_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_set_pathIterate_0);
    int _jspx_eval_set_iteratecontentrow_0 = _jspx_th_set_iteratecontentrow_0.doStartTag();
    if (_jspx_eval_set_iteratecontentrow_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_set_iteratecontentrow_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_set_iteratecontentrow_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_set_iteratecontentrow_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("     ");
        if (_jspx_meth_v_includeViewlet_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_set_iteratecontentrow_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_set_iteratecontentrow_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_set_iteratecontentrow_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_set_iteratecontentrow_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_set_iteratecontentrow.reuse(_jspx_th_set_iteratecontentrow_0);
      return true;
    }
    _jspx_tagPool_set_iteratecontentrow.reuse(_jspx_th_set_iteratecontentrow_0);
    return false;
  }

  private boolean _jspx_meth_v_includeViewlet_0(javax.servlet.jsp.tagext.JspTag _jspx_th_set_iteratecontentrow_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:includeViewlet
    org.infogrid.jee.taglib.viewlet.IncludeViewletTag _jspx_th_v_includeViewlet_0 = (org.infogrid.jee.taglib.viewlet.IncludeViewletTag) _jspx_tagPool_v_includeViewlet_requestContext_reachedByName_nobody.get(org.infogrid.jee.taglib.viewlet.IncludeViewletTag.class);
    _jspx_th_v_includeViewlet_0.setPageContext(_jspx_page_context);
    _jspx_th_v_includeViewlet_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_set_iteratecontentrow_0);
    _jspx_th_v_includeViewlet_0.setReachedByName("path");
    _jspx_th_v_includeViewlet_0.setRequestContext("include");
    int _jspx_eval_v_includeViewlet_0 = _jspx_th_v_includeViewlet_0.doStartTag();
    if (_jspx_th_v_includeViewlet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_includeViewlet_requestContext_reachedByName_nobody.reuse(_jspx_th_v_includeViewlet_0);
      return true;
    }
    _jspx_tagPool_v_includeViewlet_requestContext_reachedByName_nobody.reuse(_jspx_th_v_includeViewlet_0);
    return false;
  }

  private boolean _jspx_meth_tree_treeIterate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tree:treeIterate
    org.infogrid.jee.taglib.mesh.tree.TreeIterateTag _jspx_th_tree_treeIterate_0 = (org.infogrid.jee.taglib.mesh.tree.TreeIterateTag) _jspx_tagPool_tree_treeIterate_traversalSpecification_traversalPathLoopVar_startObjectName_meshObjectLoopVar_levelVar.get(org.infogrid.jee.taglib.mesh.tree.TreeIterateTag.class);
    _jspx_th_tree_treeIterate_0.setPageContext(_jspx_page_context);
    _jspx_th_tree_treeIterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_tree_treeIterate_0.setStartObjectName("Subject");
    _jspx_th_tree_treeIterate_0.setTraversalSpecification("xpath:* xpath:*");
    _jspx_th_tree_treeIterate_0.setLevelVar("level");
    _jspx_th_tree_treeIterate_0.setMeshObjectLoopVar("current");
    _jspx_th_tree_treeIterate_0.setTraversalPathLoopVar("traversalPath");
    int _jspx_eval_tree_treeIterate_0 = _jspx_th_tree_treeIterate_0.doStartTag();
    if (_jspx_eval_tree_treeIterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_tree_treeIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_tree_treeIterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_tree_treeIterate_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("     ");
        if (_jspx_meth_tree_down_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_tree_treeIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("     ");
        if (_jspx_meth_tree_up_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_tree_treeIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("     ");
        if (_jspx_meth_tree_nodeBefore_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_tree_treeIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_tree_treeIterate_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_tree_treeIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_tree_treeIterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tree_treeIterate_traversalSpecification_traversalPathLoopVar_startObjectName_meshObjectLoopVar_levelVar.reuse(_jspx_th_tree_treeIterate_0);
      return true;
    }
    _jspx_tagPool_tree_treeIterate_traversalSpecification_traversalPathLoopVar_startObjectName_meshObjectLoopVar_levelVar.reuse(_jspx_th_tree_treeIterate_0);
    return false;
  }

  private boolean _jspx_meth_tree_down_0(javax.servlet.jsp.tagext.JspTag _jspx_th_tree_treeIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tree:down
    org.infogrid.jee.taglib.mesh.tree.TreeIterateDownTag _jspx_th_tree_down_0 = (org.infogrid.jee.taglib.mesh.tree.TreeIterateDownTag) _jspx_tagPool_tree_down.get(org.infogrid.jee.taglib.mesh.tree.TreeIterateDownTag.class);
    _jspx_th_tree_down_0.setPageContext(_jspx_page_context);
    _jspx_th_tree_down_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tree_treeIterate_0);
    int _jspx_eval_tree_down_0 = _jspx_th_tree_down_0.doStartTag();
    if (_jspx_eval_tree_down_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_tree_down_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_tree_down_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_tree_down_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("      <dd><dl class=\"level");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${level}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("     ");
        int evalDoAfterBody = _jspx_th_tree_down_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_tree_down_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_tree_down_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tree_down.reuse(_jspx_th_tree_down_0);
      return true;
    }
    _jspx_tagPool_tree_down.reuse(_jspx_th_tree_down_0);
    return false;
  }

  private boolean _jspx_meth_tree_up_0(javax.servlet.jsp.tagext.JspTag _jspx_th_tree_treeIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tree:up
    org.infogrid.jee.taglib.mesh.tree.TreeIterateUpTag _jspx_th_tree_up_0 = (org.infogrid.jee.taglib.mesh.tree.TreeIterateUpTag) _jspx_tagPool_tree_up.get(org.infogrid.jee.taglib.mesh.tree.TreeIterateUpTag.class);
    _jspx_th_tree_up_0.setPageContext(_jspx_page_context);
    _jspx_th_tree_up_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tree_treeIterate_0);
    int _jspx_eval_tree_up_0 = _jspx_th_tree_up_0.doStartTag();
    if (_jspx_eval_tree_up_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_tree_up_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_tree_up_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_tree_up_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("       </dl></dd>\n");
        out.write("     ");
        int evalDoAfterBody = _jspx_th_tree_up_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_tree_up_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_tree_up_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tree_up.reuse(_jspx_th_tree_up_0);
      return true;
    }
    _jspx_tagPool_tree_up.reuse(_jspx_th_tree_up_0);
    return false;
  }

  private boolean _jspx_meth_tree_nodeBefore_0(javax.servlet.jsp.tagext.JspTag _jspx_th_tree_treeIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tree:nodeBefore
    org.infogrid.jee.taglib.mesh.tree.TreeIterateNodeBeforeChildrenTag _jspx_th_tree_nodeBefore_0 = (org.infogrid.jee.taglib.mesh.tree.TreeIterateNodeBeforeChildrenTag) _jspx_tagPool_tree_nodeBefore.get(org.infogrid.jee.taglib.mesh.tree.TreeIterateNodeBeforeChildrenTag.class);
    _jspx_th_tree_nodeBefore_0.setPageContext(_jspx_page_context);
    _jspx_th_tree_nodeBefore_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tree_treeIterate_0);
    int _jspx_eval_tree_nodeBefore_0 = _jspx_th_tree_nodeBefore_0.doStartTag();
    if (_jspx_eval_tree_nodeBefore_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_tree_nodeBefore_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_tree_nodeBefore_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_tree_nodeBefore_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("      <dt class=\"");
        if (_jspx_meth_v_ifIsReachedObject_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_tree_nodeBefore_0, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_v_ifIsReachedObject_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_tree_nodeBefore_0, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("       ");
        if (_jspx_meth_mesh_meshObjectLink_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_tree_nodeBefore_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("      </dt>\n");
        out.write("     ");
        int evalDoAfterBody = _jspx_th_tree_nodeBefore_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_tree_nodeBefore_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_tree_nodeBefore_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tree_nodeBefore.reuse(_jspx_th_tree_nodeBefore_0);
      return true;
    }
    _jspx_tagPool_tree_nodeBefore.reuse(_jspx_th_tree_nodeBefore_0);
    return false;
  }

  private boolean _jspx_meth_v_ifIsReachedObject_0(javax.servlet.jsp.tagext.JspTag _jspx_th_tree_nodeBefore_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:ifIsReachedObject
    org.infogrid.jee.taglib.viewlet.IfIsReachedObjectViewletTag _jspx_th_v_ifIsReachedObject_0 = (org.infogrid.jee.taglib.viewlet.IfIsReachedObjectViewletTag) _jspx_tagPool_v_ifIsReachedObject_object.get(org.infogrid.jee.taglib.viewlet.IfIsReachedObjectViewletTag.class);
    _jspx_th_v_ifIsReachedObject_0.setPageContext(_jspx_page_context);
    _jspx_th_v_ifIsReachedObject_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tree_nodeBefore_0);
    _jspx_th_v_ifIsReachedObject_0.setObject((org.infogrid.mesh.MeshObject) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${current}", org.infogrid.mesh.MeshObject.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_v_ifIsReachedObject_0 = _jspx_th_v_ifIsReachedObject_0.doStartTag();
    if (_jspx_eval_v_ifIsReachedObject_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_v_ifIsReachedObject_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_v_ifIsReachedObject_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_v_ifIsReachedObject_0.doInitBody();
      }
      do {
        out.write("reached");
        int evalDoAfterBody = _jspx_th_v_ifIsReachedObject_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_v_ifIsReachedObject_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_v_ifIsReachedObject_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_ifIsReachedObject_object.reuse(_jspx_th_v_ifIsReachedObject_0);
      return true;
    }
    _jspx_tagPool_v_ifIsReachedObject_object.reuse(_jspx_th_v_ifIsReachedObject_0);
    return false;
  }

  private boolean _jspx_meth_v_ifIsReachedObject_1(javax.servlet.jsp.tagext.JspTag _jspx_th_tree_nodeBefore_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:ifIsReachedObject
    org.infogrid.jee.taglib.viewlet.IfIsReachedObjectViewletTag _jspx_th_v_ifIsReachedObject_1 = (org.infogrid.jee.taglib.viewlet.IfIsReachedObjectViewletTag) _jspx_tagPool_v_ifIsReachedObject_traversalPath.get(org.infogrid.jee.taglib.viewlet.IfIsReachedObjectViewletTag.class);
    _jspx_th_v_ifIsReachedObject_1.setPageContext(_jspx_page_context);
    _jspx_th_v_ifIsReachedObject_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tree_nodeBefore_0);
    _jspx_th_v_ifIsReachedObject_1.setTraversalPath((org.infogrid.model.traversal.TraversalPath) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${traversalPath}", org.infogrid.model.traversal.TraversalPath.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_v_ifIsReachedObject_1 = _jspx_th_v_ifIsReachedObject_1.doStartTag();
    if (_jspx_eval_v_ifIsReachedObject_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_v_ifIsReachedObject_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_v_ifIsReachedObject_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_v_ifIsReachedObject_1.doInitBody();
      }
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_v_ifIsReachedObject_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_v_ifIsReachedObject_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_v_ifIsReachedObject_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_ifIsReachedObject_traversalPath.reuse(_jspx_th_v_ifIsReachedObject_1);
      return true;
    }
    _jspx_tagPool_v_ifIsReachedObject_traversalPath.reuse(_jspx_th_v_ifIsReachedObject_1);
    return false;
  }

  private boolean _jspx_meth_mesh_meshObjectLink_0(javax.servlet.jsp.tagext.JspTag _jspx_th_tree_nodeBefore_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshObjectLink
    org.infogrid.jee.taglib.mesh.MeshObjectLinkTag _jspx_th_mesh_meshObjectLink_0 = (org.infogrid.jee.taglib.mesh.MeshObjectLinkTag) _jspx_tagPool_mesh_meshObjectLink_traversalPathName_meshObjectName_addArguments.get(org.infogrid.jee.taglib.mesh.MeshObjectLinkTag.class);
    _jspx_th_mesh_meshObjectLink_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshObjectLink_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tree_nodeBefore_0);
    _jspx_th_mesh_meshObjectLink_0.setMeshObjectName("Subject");
    _jspx_th_mesh_meshObjectLink_0.setTraversalPathName("traversalPath");
    _jspx_th_mesh_meshObjectLink_0.setAddArguments("lid-format=viewlet:org.infogrid.jee.viewlet.graphtree.GraphTreeViewlet");
    int _jspx_eval_mesh_meshObjectLink_0 = _jspx_th_mesh_meshObjectLink_0.doStartTag();
    if (_jspx_eval_mesh_meshObjectLink_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mesh_meshObjectLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mesh_meshObjectLink_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mesh_meshObjectLink_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_mesh_meshObject_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_meshObjectLink_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("       ");
        int evalDoAfterBody = _jspx_th_mesh_meshObjectLink_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mesh_meshObjectLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_mesh_meshObjectLink_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_meshObjectLink_traversalPathName_meshObjectName_addArguments.reuse(_jspx_th_mesh_meshObjectLink_0);
      return true;
    }
    _jspx_tagPool_mesh_meshObjectLink_traversalPathName_meshObjectName_addArguments.reuse(_jspx_th_mesh_meshObjectLink_0);
    return false;
  }

  private boolean _jspx_meth_mesh_meshObject_0(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_meshObjectLink_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshObject
    org.infogrid.jee.taglib.mesh.MeshObjectTag _jspx_th_mesh_meshObject_0 = (org.infogrid.jee.taglib.mesh.MeshObjectTag) _jspx_tagPool_mesh_meshObject_meshObjectName_maxLength_nobody.get(org.infogrid.jee.taglib.mesh.MeshObjectTag.class);
    _jspx_th_mesh_meshObject_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshObject_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_meshObjectLink_0);
    _jspx_th_mesh_meshObject_0.setMeshObjectName("current");
    _jspx_th_mesh_meshObject_0.setMaxLength(20);
    int _jspx_eval_mesh_meshObject_0 = _jspx_th_mesh_meshObject_0.doStartTag();
    if (_jspx_th_mesh_meshObject_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_meshObject_meshObjectName_maxLength_nobody.reuse(_jspx_th_mesh_meshObject_0);
      return true;
    }
    _jspx_tagPool_mesh_meshObject_meshObjectName_maxLength_nobody.reuse(_jspx_th_mesh_meshObject_0);
    return false;
  }
}
