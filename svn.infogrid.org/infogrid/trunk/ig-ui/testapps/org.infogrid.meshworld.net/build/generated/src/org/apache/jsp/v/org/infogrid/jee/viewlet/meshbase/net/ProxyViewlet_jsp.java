package org.apache.jsp.v.org.infogrid.jee.viewlet.meshbase.net;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProxyViewlet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_meshbase_meshBaseId_meshBaseName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewlet;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_u_toExternalForm_objectName_filter_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_u_timeStamp_objectName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewletAlternatives_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_netmeshbase_proxy_proxyName_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_meshbase_meshBaseId_meshBaseName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewlet = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_u_toExternalForm_objectName_filter_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_u_timeStamp_objectName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewletAlternatives_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_netmeshbase_proxy_proxyName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_meshbase_meshBaseId_meshBaseName_nobody.release();
    _jspx_tagPool_v_viewlet.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_u_toExternalForm_objectName_filter_nobody.release();
    _jspx_tagPool_u_timeStamp_objectName_nobody.release();
    _jspx_tagPool_v_viewletAlternatives_nobody.release();
    _jspx_tagPool_netmeshbase_proxy_proxyName_nobody.release();
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
        out.write(" <h1>");
        if (_jspx_meth_netmeshbase_proxy_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("</h1>\n");
        out.write(" <table>\n");
        out.write("  <thead>\n");
        out.write("   <tr>\n");
        out.write("    <th>Attribute</th>\n");
        out.write("    <th>Value</th>\n");
        out.write("   </tr>\n");
        out.write("  </thead>\n");
        out.write("  <tbody>\n");
        out.write("   <tr>\n");
        out.write("    <td>Local NetMeshBase</td>\n");
        out.write("    <td>");
        if (_jspx_meth_meshbase_meshBaseId_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("   </tr>\n");
        out.write("   <tr>\n");
        out.write("    <td>Partner NetMeshBase</td>\n");
        out.write("    <td>");
        if (_jspx_meth_u_toExternalForm_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("   </tr>\n");
        out.write("   <tr>\n");
        out.write("    <td>Coherence Specification</td>\n");
        out.write("    <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Proxy.coherenceSpecification}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("   </tr>\n");
        out.write("   <tr>\n");
        out.write("    <td>Time created</td>\n");
        out.write("    <td>");
        if (_jspx_meth_u_timeStamp_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("   </tr>\n");
        out.write("   <tr>\n");
        out.write("    <td>Time updated</td>\n");
        out.write("    <td>");
        if (_jspx_meth_u_timeStamp_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("   </tr>\n");
        out.write("   <tr>\n");
        out.write("    <td>Time read</td>\n");
        out.write("    <td>");
        if (_jspx_meth_u_timeStamp_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("   </tr>\n");
        out.write("   <tr>\n");
        out.write("    <td>Time expires</td>\n");
        out.write("    <td>");
        if (_jspx_meth_u_timeStamp_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("   </tr>\n");
        out.write("   <tr>\n");
        out.write("    <td>Token last sent</td>\n");
        out.write("    <td>");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("   </tr>\n");
        out.write("   <tr>\n");
        out.write("    <td>Token last received</td>\n");
        out.write("    <td>");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("   </tr>\n");
        out.write("  </tbody>\n");
        out.write(" </table>     \n");
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

  private boolean _jspx_meth_netmeshbase_proxy_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  netmeshbase:proxy
    org.infogrid.jee.taglib.meshbase.net.ProxyTag _jspx_th_netmeshbase_proxy_0 = (org.infogrid.jee.taglib.meshbase.net.ProxyTag) _jspx_tagPool_netmeshbase_proxy_proxyName_nobody.get(org.infogrid.jee.taglib.meshbase.net.ProxyTag.class);
    _jspx_th_netmeshbase_proxy_0.setPageContext(_jspx_page_context);
    _jspx_th_netmeshbase_proxy_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_netmeshbase_proxy_0.setProxyName("Viewlet.viewedMeshObjects.meshObjectsToView.requestedProxy");
    int _jspx_eval_netmeshbase_proxy_0 = _jspx_th_netmeshbase_proxy_0.doStartTag();
    if (_jspx_th_netmeshbase_proxy_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_netmeshbase_proxy_proxyName_nobody.reuse(_jspx_th_netmeshbase_proxy_0);
      return true;
    }
    _jspx_tagPool_netmeshbase_proxy_proxyName_nobody.reuse(_jspx_th_netmeshbase_proxy_0);
    return false;
  }

  private boolean _jspx_meth_meshbase_meshBaseId_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  meshbase:meshBaseId
    org.infogrid.jee.taglib.meshbase.MeshBaseIdentifierTag _jspx_th_meshbase_meshBaseId_0 = (org.infogrid.jee.taglib.meshbase.MeshBaseIdentifierTag) _jspx_tagPool_meshbase_meshBaseId_meshBaseName_nobody.get(org.infogrid.jee.taglib.meshbase.MeshBaseIdentifierTag.class);
    _jspx_th_meshbase_meshBaseId_0.setPageContext(_jspx_page_context);
    _jspx_th_meshbase_meshBaseId_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_meshbase_meshBaseId_0.setMeshBaseName("Proxy.NetMeshBase");
    int _jspx_eval_meshbase_meshBaseId_0 = _jspx_th_meshbase_meshBaseId_0.doStartTag();
    if (_jspx_th_meshbase_meshBaseId_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_meshbase_meshBaseId_meshBaseName_nobody.reuse(_jspx_th_meshbase_meshBaseId_0);
      return true;
    }
    _jspx_tagPool_meshbase_meshBaseId_meshBaseName_nobody.reuse(_jspx_th_meshbase_meshBaseId_0);
    return false;
  }

  private boolean _jspx_meth_u_toExternalForm_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:toExternalForm
    org.infogrid.jee.taglib.util.ToExternalFormTag _jspx_th_u_toExternalForm_0 = (org.infogrid.jee.taglib.util.ToExternalFormTag) _jspx_tagPool_u_toExternalForm_objectName_filter_nobody.get(org.infogrid.jee.taglib.util.ToExternalFormTag.class);
    _jspx_th_u_toExternalForm_0.setPageContext(_jspx_page_context);
    _jspx_th_u_toExternalForm_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_u_toExternalForm_0.setObjectName("Proxy.PartnerMeshBaseIdentifier");
    _jspx_th_u_toExternalForm_0.setFilter("true");
    int _jspx_eval_u_toExternalForm_0 = _jspx_th_u_toExternalForm_0.doStartTag();
    if (_jspx_th_u_toExternalForm_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_toExternalForm_objectName_filter_nobody.reuse(_jspx_th_u_toExternalForm_0);
      return true;
    }
    _jspx_tagPool_u_toExternalForm_objectName_filter_nobody.reuse(_jspx_th_u_toExternalForm_0);
    return false;
  }

  private boolean _jspx_meth_u_timeStamp_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:timeStamp
    org.infogrid.jee.taglib.util.TimeStampTag _jspx_th_u_timeStamp_0 = (org.infogrid.jee.taglib.util.TimeStampTag) _jspx_tagPool_u_timeStamp_objectName_nobody.get(org.infogrid.jee.taglib.util.TimeStampTag.class);
    _jspx_th_u_timeStamp_0.setPageContext(_jspx_page_context);
    _jspx_th_u_timeStamp_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_u_timeStamp_0.setObjectName("Proxy.timeCreated");
    int _jspx_eval_u_timeStamp_0 = _jspx_th_u_timeStamp_0.doStartTag();
    if (_jspx_th_u_timeStamp_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_timeStamp_objectName_nobody.reuse(_jspx_th_u_timeStamp_0);
      return true;
    }
    _jspx_tagPool_u_timeStamp_objectName_nobody.reuse(_jspx_th_u_timeStamp_0);
    return false;
  }

  private boolean _jspx_meth_u_timeStamp_1(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:timeStamp
    org.infogrid.jee.taglib.util.TimeStampTag _jspx_th_u_timeStamp_1 = (org.infogrid.jee.taglib.util.TimeStampTag) _jspx_tagPool_u_timeStamp_objectName_nobody.get(org.infogrid.jee.taglib.util.TimeStampTag.class);
    _jspx_th_u_timeStamp_1.setPageContext(_jspx_page_context);
    _jspx_th_u_timeStamp_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_u_timeStamp_1.setObjectName("Proxy.timeUpdated");
    int _jspx_eval_u_timeStamp_1 = _jspx_th_u_timeStamp_1.doStartTag();
    if (_jspx_th_u_timeStamp_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_timeStamp_objectName_nobody.reuse(_jspx_th_u_timeStamp_1);
      return true;
    }
    _jspx_tagPool_u_timeStamp_objectName_nobody.reuse(_jspx_th_u_timeStamp_1);
    return false;
  }

  private boolean _jspx_meth_u_timeStamp_2(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:timeStamp
    org.infogrid.jee.taglib.util.TimeStampTag _jspx_th_u_timeStamp_2 = (org.infogrid.jee.taglib.util.TimeStampTag) _jspx_tagPool_u_timeStamp_objectName_nobody.get(org.infogrid.jee.taglib.util.TimeStampTag.class);
    _jspx_th_u_timeStamp_2.setPageContext(_jspx_page_context);
    _jspx_th_u_timeStamp_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_u_timeStamp_2.setObjectName("Proxy.timeRead");
    int _jspx_eval_u_timeStamp_2 = _jspx_th_u_timeStamp_2.doStartTag();
    if (_jspx_th_u_timeStamp_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_timeStamp_objectName_nobody.reuse(_jspx_th_u_timeStamp_2);
      return true;
    }
    _jspx_tagPool_u_timeStamp_objectName_nobody.reuse(_jspx_th_u_timeStamp_2);
    return false;
  }

  private boolean _jspx_meth_u_timeStamp_3(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:timeStamp
    org.infogrid.jee.taglib.util.TimeStampTag _jspx_th_u_timeStamp_3 = (org.infogrid.jee.taglib.util.TimeStampTag) _jspx_tagPool_u_timeStamp_objectName_nobody.get(org.infogrid.jee.taglib.util.TimeStampTag.class);
    _jspx_th_u_timeStamp_3.setPageContext(_jspx_page_context);
    _jspx_th_u_timeStamp_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_u_timeStamp_3.setObjectName("Proxy.timeExpires");
    int _jspx_eval_u_timeStamp_3 = _jspx_th_u_timeStamp_3.doStartTag();
    if (_jspx_th_u_timeStamp_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_timeStamp_objectName_nobody.reuse(_jspx_th_u_timeStamp_3);
      return true;
    }
    _jspx_tagPool_u_timeStamp_objectName_nobody.reuse(_jspx_th_u_timeStamp_3);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Proxy.messageEndpoint.lastSentToken}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Proxy.messageEndpoint.lastReceivedToken}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }
}
