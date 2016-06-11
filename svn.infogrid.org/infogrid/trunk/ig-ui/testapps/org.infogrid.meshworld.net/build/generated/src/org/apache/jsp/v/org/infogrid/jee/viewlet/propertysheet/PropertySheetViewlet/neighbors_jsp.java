package org.apache.jsp.v.org.infogrid.jee.viewlet.propertysheet.PropertySheetViewlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class neighbors_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_meshObjectLink_meshObjectName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_u_callJspoParam_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_notIfState_viewletState;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_roleIterate_startObjectName_roleTypeLoopVar_destinationObjectName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_type_meshTypeName_filter_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_neighborIterate_neighborLoopVar_meshObjectName;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_mesh_meshObjectLink_meshObjectName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_u_callJspoParam_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_notIfState_viewletState = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_roleIterate_startObjectName_roleTypeLoopVar_destinationObjectName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_type_meshTypeName_filter_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_neighborIterate_neighborLoopVar_meshObjectName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_mesh_meshObjectLink_meshObjectName.release();
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody.release();
    _jspx_tagPool_u_callJspoParam_value_name_nobody.release();
    _jspx_tagPool_v_notIfState_viewletState.release();
    _jspx_tagPool_mesh_roleIterate_startObjectName_roleTypeLoopVar_destinationObjectName.release();
    _jspx_tagPool_mesh_type_meshTypeName_filter_nobody.release();
    _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action.release();
    _jspx_tagPool_mesh_neighborIterate_neighborLoopVar_meshObjectName.release();
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
      out.write(" <table class=\"neighbors\">\n");
      out.write("  <thead>\n");
      out.write("   <tr>\n");
      out.write("    <th class=\"role\">Roles</th>\n");
      out.write("    <th class=\"neighbor\">\n");
      out.write("     ");
      if (_jspx_meth_v_notIfState_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("     Neighbor\n");
      out.write("    </th>\n");
      out.write("   </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("   ");
      if (_jspx_meth_mesh_neighborIterate_0(_jspx_page_context))
        return;
      out.write("\n");
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

  private boolean _jspx_meth_v_notIfState_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:notIfState
    org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag _jspx_th_v_notIfState_0 = (org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag) _jspx_tagPool_v_notIfState_viewletState.get(org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag.class);
    _jspx_th_v_notIfState_0.setPageContext(_jspx_page_context);
    _jspx_th_v_notIfState_0.setParent(null);
    _jspx_th_v_notIfState_0.setViewletState("edit");
    int _jspx_eval_v_notIfState_0 = _jspx_th_v_notIfState_0.doStartTag();
    if (_jspx_eval_v_notIfState_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("      <div class=\"slide-in-button\">\n");
        out.write("       ");
        if (_jspx_meth_u_callJspo_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_notIfState_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("      </div>\n");
        out.write("     ");
        int evalDoAfterBody = _jspx_th_v_notIfState_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_v_notIfState_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_notIfState_viewletState.reuse(_jspx_th_v_notIfState_0);
      return true;
    }
    _jspx_tagPool_v_notIfState_viewletState.reuse(_jspx_th_v_notIfState_0);
    return false;
  }

  private boolean _jspx_meth_u_callJspo_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_notIfState_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:callJspo
    org.infogrid.jee.taglib.util.CallJspoTag _jspx_th_u_callJspo_0 = (org.infogrid.jee.taglib.util.CallJspoTag) _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action.get(org.infogrid.jee.taglib.util.CallJspoTag.class);
    _jspx_th_u_callJspo_0.setPageContext(_jspx_page_context);
    _jspx_th_u_callJspo_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_notIfState_0);
    _jspx_th_u_callJspo_0.setPage("/o/relate.jspo");
    _jspx_th_u_callJspo_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Viewlet.postUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_u_callJspo_0.setLinkTitle("Add a neighbor");
    _jspx_th_u_callJspo_0.setSubmitLabel("Relate");
    int _jspx_eval_u_callJspo_0 = _jspx_th_u_callJspo_0.doStartTag();
    if (_jspx_eval_u_callJspo_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_u_callJspo_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_u_callJspo_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_u_callJspo_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_u_callJspoParam_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_u_callJspo_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/s/images/link_add.png\" alt=\"Add a neighbor\" />\n");
        out.write("       ");
        int evalDoAfterBody = _jspx_th_u_callJspo_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_u_callJspo_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_u_callJspo_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action.reuse(_jspx_th_u_callJspo_0);
      return true;
    }
    _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action.reuse(_jspx_th_u_callJspo_0);
    return false;
  }

  private boolean _jspx_meth_u_callJspoParam_0(javax.servlet.jsp.tagext.JspTag _jspx_th_u_callJspo_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:callJspoParam
    org.infogrid.jee.taglib.util.CallJspoParamTag _jspx_th_u_callJspoParam_0 = (org.infogrid.jee.taglib.util.CallJspoParamTag) _jspx_tagPool_u_callJspoParam_value_name_nobody.get(org.infogrid.jee.taglib.util.CallJspoParamTag.class);
    _jspx_th_u_callJspoParam_0.setPageContext(_jspx_page_context);
    _jspx_th_u_callJspoParam_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_u_callJspo_0);
    _jspx_th_u_callJspoParam_0.setName("from");
    _jspx_th_u_callJspoParam_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Subject}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_u_callJspoParam_0 = _jspx_th_u_callJspoParam_0.doStartTag();
    if (_jspx_th_u_callJspoParam_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_0);
      return true;
    }
    _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_0);
    return false;
  }

  private boolean _jspx_meth_mesh_neighborIterate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:neighborIterate
    org.infogrid.jee.taglib.mesh.MeshObjectNeighborIterateTag _jspx_th_mesh_neighborIterate_0 = (org.infogrid.jee.taglib.mesh.MeshObjectNeighborIterateTag) _jspx_tagPool_mesh_neighborIterate_neighborLoopVar_meshObjectName.get(org.infogrid.jee.taglib.mesh.MeshObjectNeighborIterateTag.class);
    _jspx_th_mesh_neighborIterate_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_neighborIterate_0.setParent(null);
    _jspx_th_mesh_neighborIterate_0.setMeshObjectName("Subject");
    _jspx_th_mesh_neighborIterate_0.setNeighborLoopVar("neighbor");
    int _jspx_eval_mesh_neighborIterate_0 = _jspx_th_mesh_neighborIterate_0.doStartTag();
    if (_jspx_eval_mesh_neighborIterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mesh_neighborIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mesh_neighborIterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mesh_neighborIterate_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    <tr>\n");
        out.write("     <td class=\"role\">\n");
        out.write("      ");
        if (_jspx_meth_v_notIfState_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_neighborIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("      <ul>\n");
        out.write("       ");
        if (_jspx_meth_mesh_roleIterate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_neighborIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("      </ul>\n");
        out.write("     </td>\n");
        out.write("     <td class=\"neighbor\">\n");
        out.write("      ");
        if (_jspx_meth_v_notIfState_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_neighborIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("      ");
        if (_jspx_meth_mesh_meshObjectLink_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_neighborIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("     </td>\n");
        out.write("    </tr>\n");
        out.write("   ");
        int evalDoAfterBody = _jspx_th_mesh_neighborIterate_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mesh_neighborIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_mesh_neighborIterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_neighborIterate_neighborLoopVar_meshObjectName.reuse(_jspx_th_mesh_neighborIterate_0);
      return true;
    }
    _jspx_tagPool_mesh_neighborIterate_neighborLoopVar_meshObjectName.reuse(_jspx_th_mesh_neighborIterate_0);
    return false;
  }

  private boolean _jspx_meth_v_notIfState_1(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_neighborIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:notIfState
    org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag _jspx_th_v_notIfState_1 = (org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag) _jspx_tagPool_v_notIfState_viewletState.get(org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag.class);
    _jspx_th_v_notIfState_1.setPageContext(_jspx_page_context);
    _jspx_th_v_notIfState_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_neighborIterate_0);
    _jspx_th_v_notIfState_1.setViewletState("edit");
    int _jspx_eval_v_notIfState_1 = _jspx_th_v_notIfState_1.doStartTag();
    if (_jspx_eval_v_notIfState_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("       <div class=\"slide-in-button\">\n");
        out.write("        ");
        if (_jspx_meth_u_callJspo_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_notIfState_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("       </div>\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_v_notIfState_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_v_notIfState_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_notIfState_viewletState.reuse(_jspx_th_v_notIfState_1);
      return true;
    }
    _jspx_tagPool_v_notIfState_viewletState.reuse(_jspx_th_v_notIfState_1);
    return false;
  }

  private boolean _jspx_meth_u_callJspo_1(javax.servlet.jsp.tagext.JspTag _jspx_th_v_notIfState_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:callJspo
    org.infogrid.jee.taglib.util.CallJspoTag _jspx_th_u_callJspo_1 = (org.infogrid.jee.taglib.util.CallJspoTag) _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action.get(org.infogrid.jee.taglib.util.CallJspoTag.class);
    _jspx_th_u_callJspo_1.setPageContext(_jspx_page_context);
    _jspx_th_u_callJspo_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_notIfState_1);
    _jspx_th_u_callJspo_1.setPage("/o/blessRole.jspo");
    _jspx_th_u_callJspo_1.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Viewlet.postUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_u_callJspo_1.setLinkTitle("Add a role");
    _jspx_th_u_callJspo_1.setSubmitLabel("Add role");
    int _jspx_eval_u_callJspo_1 = _jspx_th_u_callJspo_1.doStartTag();
    if (_jspx_eval_u_callJspo_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_u_callJspo_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_u_callJspo_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_u_callJspo_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("         ");
        if (_jspx_meth_u_callJspoParam_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_u_callJspo_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("         ");
        if (_jspx_meth_u_callJspoParam_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_u_callJspo_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("         <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/s/images/medal_silver_add.png\" alt=\"Add a role\" />\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_u_callJspo_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_u_callJspo_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_u_callJspo_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action.reuse(_jspx_th_u_callJspo_1);
      return true;
    }
    _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action.reuse(_jspx_th_u_callJspo_1);
    return false;
  }

  private boolean _jspx_meth_u_callJspoParam_1(javax.servlet.jsp.tagext.JspTag _jspx_th_u_callJspo_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:callJspoParam
    org.infogrid.jee.taglib.util.CallJspoParamTag _jspx_th_u_callJspoParam_1 = (org.infogrid.jee.taglib.util.CallJspoParamTag) _jspx_tagPool_u_callJspoParam_value_name_nobody.get(org.infogrid.jee.taglib.util.CallJspoParamTag.class);
    _jspx_th_u_callJspoParam_1.setPageContext(_jspx_page_context);
    _jspx_th_u_callJspoParam_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_u_callJspo_1);
    _jspx_th_u_callJspoParam_1.setName("from");
    _jspx_th_u_callJspoParam_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Subject}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_u_callJspoParam_1 = _jspx_th_u_callJspoParam_1.doStartTag();
    if (_jspx_th_u_callJspoParam_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_1);
      return true;
    }
    _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_1);
    return false;
  }

  private boolean _jspx_meth_u_callJspoParam_2(javax.servlet.jsp.tagext.JspTag _jspx_th_u_callJspo_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:callJspoParam
    org.infogrid.jee.taglib.util.CallJspoParamTag _jspx_th_u_callJspoParam_2 = (org.infogrid.jee.taglib.util.CallJspoParamTag) _jspx_tagPool_u_callJspoParam_value_name_nobody.get(org.infogrid.jee.taglib.util.CallJspoParamTag.class);
    _jspx_th_u_callJspoParam_2.setPageContext(_jspx_page_context);
    _jspx_th_u_callJspoParam_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_u_callJspo_1);
    _jspx_th_u_callJspoParam_2.setName("to");
    _jspx_th_u_callJspoParam_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${neighbor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_u_callJspoParam_2 = _jspx_th_u_callJspoParam_2.doStartTag();
    if (_jspx_th_u_callJspoParam_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_2);
      return true;
    }
    _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_2);
    return false;
  }

  private boolean _jspx_meth_mesh_roleIterate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_neighborIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:roleIterate
    org.infogrid.jee.taglib.mesh.MeshObjectRoleIterateTag _jspx_th_mesh_roleIterate_0 = (org.infogrid.jee.taglib.mesh.MeshObjectRoleIterateTag) _jspx_tagPool_mesh_roleIterate_startObjectName_roleTypeLoopVar_destinationObjectName.get(org.infogrid.jee.taglib.mesh.MeshObjectRoleIterateTag.class);
    _jspx_th_mesh_roleIterate_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_roleIterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_neighborIterate_0);
    _jspx_th_mesh_roleIterate_0.setStartObjectName("Subject");
    _jspx_th_mesh_roleIterate_0.setDestinationObjectName("neighbor");
    _jspx_th_mesh_roleIterate_0.setRoleTypeLoopVar("roleType");
    int _jspx_eval_mesh_roleIterate_0 = _jspx_th_mesh_roleIterate_0.doStartTag();
    if (_jspx_eval_mesh_roleIterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mesh_roleIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mesh_roleIterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mesh_roleIterate_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        <li>\n");
        out.write("         ");
        if (_jspx_meth_v_notIfState_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_roleIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("         ");
        if (_jspx_meth_mesh_type_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_roleIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        </li>\n");
        out.write("       ");
        int evalDoAfterBody = _jspx_th_mesh_roleIterate_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mesh_roleIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_mesh_roleIterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_roleIterate_startObjectName_roleTypeLoopVar_destinationObjectName.reuse(_jspx_th_mesh_roleIterate_0);
      return true;
    }
    _jspx_tagPool_mesh_roleIterate_startObjectName_roleTypeLoopVar_destinationObjectName.reuse(_jspx_th_mesh_roleIterate_0);
    return false;
  }

  private boolean _jspx_meth_v_notIfState_2(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_roleIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:notIfState
    org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag _jspx_th_v_notIfState_2 = (org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag) _jspx_tagPool_v_notIfState_viewletState.get(org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag.class);
    _jspx_th_v_notIfState_2.setPageContext(_jspx_page_context);
    _jspx_th_v_notIfState_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_roleIterate_0);
    _jspx_th_v_notIfState_2.setViewletState("edit");
    int _jspx_eval_v_notIfState_2 = _jspx_th_v_notIfState_2.doStartTag();
    if (_jspx_eval_v_notIfState_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("          <div class=\"slide-in-button\">\n");
        out.write("           ");
        if (_jspx_meth_u_callJspo_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_notIfState_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("          </div>\n");
        out.write("         ");
        int evalDoAfterBody = _jspx_th_v_notIfState_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_v_notIfState_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_notIfState_viewletState.reuse(_jspx_th_v_notIfState_2);
      return true;
    }
    _jspx_tagPool_v_notIfState_viewletState.reuse(_jspx_th_v_notIfState_2);
    return false;
  }

  private boolean _jspx_meth_u_callJspo_2(javax.servlet.jsp.tagext.JspTag _jspx_th_v_notIfState_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:callJspo
    org.infogrid.jee.taglib.util.CallJspoTag _jspx_th_u_callJspo_2 = (org.infogrid.jee.taglib.util.CallJspoTag) _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action.get(org.infogrid.jee.taglib.util.CallJspoTag.class);
    _jspx_th_u_callJspo_2.setPageContext(_jspx_page_context);
    _jspx_th_u_callJspo_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_notIfState_2);
    _jspx_th_u_callJspo_2.setPage("/o/unblessRole.jspo");
    _jspx_th_u_callJspo_2.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Viewlet.postUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_u_callJspo_2.setLinkTitle("Delete a role");
    _jspx_th_u_callJspo_2.setSubmitLabel("Delete role");
    int _jspx_eval_u_callJspo_2 = _jspx_th_u_callJspo_2.doStartTag();
    if (_jspx_eval_u_callJspo_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_u_callJspo_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_u_callJspo_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_u_callJspo_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_u_callJspoParam_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_u_callJspo_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_u_callJspoParam_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_u_callJspo_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_u_callJspoParam_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_u_callJspo_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/s/images/medal_silver_delete.png\" alt=\"Delete a role\" />\n");
        out.write("           ");
        int evalDoAfterBody = _jspx_th_u_callJspo_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_u_callJspo_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_u_callJspo_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action.reuse(_jspx_th_u_callJspo_2);
      return true;
    }
    _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action.reuse(_jspx_th_u_callJspo_2);
    return false;
  }

  private boolean _jspx_meth_u_callJspoParam_3(javax.servlet.jsp.tagext.JspTag _jspx_th_u_callJspo_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:callJspoParam
    org.infogrid.jee.taglib.util.CallJspoParamTag _jspx_th_u_callJspoParam_3 = (org.infogrid.jee.taglib.util.CallJspoParamTag) _jspx_tagPool_u_callJspoParam_value_name_nobody.get(org.infogrid.jee.taglib.util.CallJspoParamTag.class);
    _jspx_th_u_callJspoParam_3.setPageContext(_jspx_page_context);
    _jspx_th_u_callJspoParam_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_u_callJspo_2);
    _jspx_th_u_callJspoParam_3.setName("from");
    _jspx_th_u_callJspoParam_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Subject}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_u_callJspoParam_3 = _jspx_th_u_callJspoParam_3.doStartTag();
    if (_jspx_th_u_callJspoParam_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_3);
      return true;
    }
    _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_3);
    return false;
  }

  private boolean _jspx_meth_u_callJspoParam_4(javax.servlet.jsp.tagext.JspTag _jspx_th_u_callJspo_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:callJspoParam
    org.infogrid.jee.taglib.util.CallJspoParamTag _jspx_th_u_callJspoParam_4 = (org.infogrid.jee.taglib.util.CallJspoParamTag) _jspx_tagPool_u_callJspoParam_value_name_nobody.get(org.infogrid.jee.taglib.util.CallJspoParamTag.class);
    _jspx_th_u_callJspoParam_4.setPageContext(_jspx_page_context);
    _jspx_th_u_callJspoParam_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_u_callJspo_2);
    _jspx_th_u_callJspoParam_4.setName("to");
    _jspx_th_u_callJspoParam_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${neighbor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_u_callJspoParam_4 = _jspx_th_u_callJspoParam_4.doStartTag();
    if (_jspx_th_u_callJspoParam_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_4);
      return true;
    }
    _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_4);
    return false;
  }

  private boolean _jspx_meth_u_callJspoParam_5(javax.servlet.jsp.tagext.JspTag _jspx_th_u_callJspo_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:callJspoParam
    org.infogrid.jee.taglib.util.CallJspoParamTag _jspx_th_u_callJspoParam_5 = (org.infogrid.jee.taglib.util.CallJspoParamTag) _jspx_tagPool_u_callJspoParam_value_name_nobody.get(org.infogrid.jee.taglib.util.CallJspoParamTag.class);
    _jspx_th_u_callJspoParam_5.setPageContext(_jspx_page_context);
    _jspx_th_u_callJspoParam_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_u_callJspo_2);
    _jspx_th_u_callJspoParam_5.setName("role");
    _jspx_th_u_callJspoParam_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roleType}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_u_callJspoParam_5 = _jspx_th_u_callJspoParam_5.doStartTag();
    if (_jspx_th_u_callJspoParam_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_5);
      return true;
    }
    _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_5);
    return false;
  }

  private boolean _jspx_meth_mesh_type_0(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_roleIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:type
    org.infogrid.jee.taglib.mesh.MeshTypeTag _jspx_th_mesh_type_0 = (org.infogrid.jee.taglib.mesh.MeshTypeTag) _jspx_tagPool_mesh_type_meshTypeName_filter_nobody.get(org.infogrid.jee.taglib.mesh.MeshTypeTag.class);
    _jspx_th_mesh_type_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_type_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_roleIterate_0);
    _jspx_th_mesh_type_0.setMeshTypeName("roleType");
    _jspx_th_mesh_type_0.setFilter("false");
    int _jspx_eval_mesh_type_0 = _jspx_th_mesh_type_0.doStartTag();
    if (_jspx_th_mesh_type_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_type_meshTypeName_filter_nobody.reuse(_jspx_th_mesh_type_0);
      return true;
    }
    _jspx_tagPool_mesh_type_meshTypeName_filter_nobody.reuse(_jspx_th_mesh_type_0);
    return false;
  }

  private boolean _jspx_meth_v_notIfState_3(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_neighborIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:notIfState
    org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag _jspx_th_v_notIfState_3 = (org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag) _jspx_tagPool_v_notIfState_viewletState.get(org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag.class);
    _jspx_th_v_notIfState_3.setPageContext(_jspx_page_context);
    _jspx_th_v_notIfState_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_neighborIterate_0);
    _jspx_th_v_notIfState_3.setViewletState("edit");
    int _jspx_eval_v_notIfState_3 = _jspx_th_v_notIfState_3.doStartTag();
    if (_jspx_eval_v_notIfState_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("       <div class=\"slide-in-button\">\n");
        out.write("        ");
        if (_jspx_meth_u_callJspo_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_notIfState_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("       </div>\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_v_notIfState_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_v_notIfState_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_notIfState_viewletState.reuse(_jspx_th_v_notIfState_3);
      return true;
    }
    _jspx_tagPool_v_notIfState_viewletState.reuse(_jspx_th_v_notIfState_3);
    return false;
  }

  private boolean _jspx_meth_u_callJspo_3(javax.servlet.jsp.tagext.JspTag _jspx_th_v_notIfState_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:callJspo
    org.infogrid.jee.taglib.util.CallJspoTag _jspx_th_u_callJspo_3 = (org.infogrid.jee.taglib.util.CallJspoTag) _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action.get(org.infogrid.jee.taglib.util.CallJspoTag.class);
    _jspx_th_u_callJspo_3.setPageContext(_jspx_page_context);
    _jspx_th_u_callJspo_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_notIfState_3);
    _jspx_th_u_callJspo_3.setPage("/o/unrelate.jspo");
    _jspx_th_u_callJspo_3.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Viewlet.postUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_u_callJspo_3.setLinkTitle("Unrelate from neighbor");
    _jspx_th_u_callJspo_3.setSubmitLabel("Unrelate");
    int _jspx_eval_u_callJspo_3 = _jspx_th_u_callJspo_3.doStartTag();
    if (_jspx_eval_u_callJspo_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_u_callJspo_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_u_callJspo_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_u_callJspo_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("         ");
        if (_jspx_meth_u_callJspoParam_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_u_callJspo_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("         ");
        if (_jspx_meth_u_callJspoParam_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_u_callJspo_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("         <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/s/images/link_delete.png\" alt=\"Unrelate from neighbor\" />\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_u_callJspo_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_u_callJspo_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_u_callJspo_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action.reuse(_jspx_th_u_callJspo_3);
      return true;
    }
    _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action.reuse(_jspx_th_u_callJspo_3);
    return false;
  }

  private boolean _jspx_meth_u_callJspoParam_6(javax.servlet.jsp.tagext.JspTag _jspx_th_u_callJspo_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:callJspoParam
    org.infogrid.jee.taglib.util.CallJspoParamTag _jspx_th_u_callJspoParam_6 = (org.infogrid.jee.taglib.util.CallJspoParamTag) _jspx_tagPool_u_callJspoParam_value_name_nobody.get(org.infogrid.jee.taglib.util.CallJspoParamTag.class);
    _jspx_th_u_callJspoParam_6.setPageContext(_jspx_page_context);
    _jspx_th_u_callJspoParam_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_u_callJspo_3);
    _jspx_th_u_callJspoParam_6.setName("from");
    _jspx_th_u_callJspoParam_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Subject}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_u_callJspoParam_6 = _jspx_th_u_callJspoParam_6.doStartTag();
    if (_jspx_th_u_callJspoParam_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_6);
      return true;
    }
    _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_6);
    return false;
  }

  private boolean _jspx_meth_u_callJspoParam_7(javax.servlet.jsp.tagext.JspTag _jspx_th_u_callJspo_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:callJspoParam
    org.infogrid.jee.taglib.util.CallJspoParamTag _jspx_th_u_callJspoParam_7 = (org.infogrid.jee.taglib.util.CallJspoParamTag) _jspx_tagPool_u_callJspoParam_value_name_nobody.get(org.infogrid.jee.taglib.util.CallJspoParamTag.class);
    _jspx_th_u_callJspoParam_7.setPageContext(_jspx_page_context);
    _jspx_th_u_callJspoParam_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_u_callJspo_3);
    _jspx_th_u_callJspoParam_7.setName("to");
    _jspx_th_u_callJspoParam_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${neighbor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_u_callJspoParam_7 = _jspx_th_u_callJspoParam_7.doStartTag();
    if (_jspx_th_u_callJspoParam_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_7);
      return true;
    }
    _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_7);
    return false;
  }

  private boolean _jspx_meth_mesh_meshObjectLink_0(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_neighborIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshObjectLink
    org.infogrid.jee.taglib.mesh.MeshObjectLinkTag _jspx_th_mesh_meshObjectLink_0 = (org.infogrid.jee.taglib.mesh.MeshObjectLinkTag) _jspx_tagPool_mesh_meshObjectLink_meshObjectName.get(org.infogrid.jee.taglib.mesh.MeshObjectLinkTag.class);
    _jspx_th_mesh_meshObjectLink_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshObjectLink_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_neighborIterate_0);
    _jspx_th_mesh_meshObjectLink_0.setMeshObjectName("neighbor");
    int _jspx_eval_mesh_meshObjectLink_0 = _jspx_th_mesh_meshObjectLink_0.doStartTag();
    if (_jspx_eval_mesh_meshObjectLink_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mesh_meshObjectLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mesh_meshObjectLink_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mesh_meshObjectLink_0.doInitBody();
      }
      do {
        if (_jspx_meth_mesh_meshObjectId_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_meshObjectLink_0, _jspx_page_context))
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

  private boolean _jspx_meth_mesh_meshObjectId_0(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_meshObjectLink_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshObjectId
    org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag _jspx_th_mesh_meshObjectId_0 = (org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag) _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody.get(org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag.class);
    _jspx_th_mesh_meshObjectId_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshObjectId_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_meshObjectLink_0);
    _jspx_th_mesh_meshObjectId_0.setMeshObjectName("neighbor");
    _jspx_th_mesh_meshObjectId_0.setStringRepresentation("Plain");
    _jspx_th_mesh_meshObjectId_0.setFilter("true");
    _jspx_th_mesh_meshObjectId_0.setMaxLength(35);
    int _jspx_eval_mesh_meshObjectId_0 = _jspx_th_mesh_meshObjectId_0.doStartTag();
    if (_jspx_th_mesh_meshObjectId_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody.reuse(_jspx_th_mesh_meshObjectId_0);
      return true;
    }
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_filter_nobody.reuse(_jspx_th_mesh_meshObjectId_0);
    return false;
  }
}
