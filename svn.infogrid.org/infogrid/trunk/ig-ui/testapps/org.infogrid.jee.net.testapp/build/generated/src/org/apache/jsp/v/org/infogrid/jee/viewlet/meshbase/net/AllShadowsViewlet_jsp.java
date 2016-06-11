package org.apache.jsp.v.org.infogrid.jee.viewlet.meshbase.net;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AllShadowsViewlet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_meshbase_meshBaseId_meshBaseName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewlet;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_meshbase_meshBaseLink_meshBaseName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewletAlternatives_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_meshbase_meshBaseId_meshBaseName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewlet = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_meshbase_meshBaseLink_meshBaseName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewletAlternatives_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_meshbase_meshBaseId_meshBaseName_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_v_viewlet.release();
    _jspx_tagPool_meshbase_meshBaseLink_meshBaseName.release();
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
        out.write(" <h1>All Shadow MeshBases</h1>\n");
        out.write(" <ol>\n");
        out.write("  ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write(" </ol>\n");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Subject.meshBase.shadowMeshBases}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("current");
    _jspx_th_c_forEach_0.setVarStatus("currentStatus");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("   <li>\n");
          out.write("    ");
          if (_jspx_meth_meshbase_meshBaseLink_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("   </li>\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_meshbase_meshBaseLink_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  meshbase:meshBaseLink
    org.infogrid.jee.taglib.meshbase.MeshBaseLinkTag _jspx_th_meshbase_meshBaseLink_0 = (org.infogrid.jee.taglib.meshbase.MeshBaseLinkTag) _jspx_tagPool_meshbase_meshBaseLink_meshBaseName.get(org.infogrid.jee.taglib.meshbase.MeshBaseLinkTag.class);
    _jspx_th_meshbase_meshBaseLink_0.setPageContext(_jspx_page_context);
    _jspx_th_meshbase_meshBaseLink_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_meshbase_meshBaseLink_0.setMeshBaseName("current");
    int _jspx_eval_meshbase_meshBaseLink_0 = _jspx_th_meshbase_meshBaseLink_0.doStartTag();
    if (_jspx_eval_meshbase_meshBaseLink_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_meshbase_meshBaseLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_meshbase_meshBaseLink_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_meshbase_meshBaseLink_0.doInitBody();
      }
      do {
        out.write("MeshBase ");
        if (_jspx_meth_meshbase_meshBaseId_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_meshbase_meshBaseLink_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        int evalDoAfterBody = _jspx_th_meshbase_meshBaseLink_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_meshbase_meshBaseLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_0[0]--;
    }
    if (_jspx_th_meshbase_meshBaseLink_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_meshbase_meshBaseLink_meshBaseName.reuse(_jspx_th_meshbase_meshBaseLink_0);
      return true;
    }
    _jspx_tagPool_meshbase_meshBaseLink_meshBaseName.reuse(_jspx_th_meshbase_meshBaseLink_0);
    return false;
  }

  private boolean _jspx_meth_meshbase_meshBaseId_0(javax.servlet.jsp.tagext.JspTag _jspx_th_meshbase_meshBaseLink_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  meshbase:meshBaseId
    org.infogrid.jee.taglib.meshbase.MeshBaseIdentifierTag _jspx_th_meshbase_meshBaseId_0 = (org.infogrid.jee.taglib.meshbase.MeshBaseIdentifierTag) _jspx_tagPool_meshbase_meshBaseId_meshBaseName_nobody.get(org.infogrid.jee.taglib.meshbase.MeshBaseIdentifierTag.class);
    _jspx_th_meshbase_meshBaseId_0.setPageContext(_jspx_page_context);
    _jspx_th_meshbase_meshBaseId_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_meshbase_meshBaseLink_0);
    _jspx_th_meshbase_meshBaseId_0.setMeshBaseName("current");
    int _jspx_eval_meshbase_meshBaseId_0 = _jspx_th_meshbase_meshBaseId_0.doStartTag();
    if (_jspx_th_meshbase_meshBaseId_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_meshbase_meshBaseId_meshBaseName_nobody.reuse(_jspx_th_meshbase_meshBaseId_0);
      return true;
    }
    _jspx_tagPool_meshbase_meshBaseId_meshBaseName_nobody.reuse(_jspx_th_meshbase_meshBaseId_0);
    return false;
  }
}
