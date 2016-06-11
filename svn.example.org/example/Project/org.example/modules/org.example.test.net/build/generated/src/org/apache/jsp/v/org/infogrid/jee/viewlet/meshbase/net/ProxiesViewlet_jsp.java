package org.apache.jsp.v.org.infogrid.jee.viewlet.meshbase.net;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProxiesViewlet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_netmeshbase_proxyIterate_meshBaseName_loopVar;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_netmeshbase_notIfMeshBaseHasProxies_meshBaseName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewlet;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_netmeshbase_ifMeshBaseHasProxies_meshBaseName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_meshbase_meshBaseId_stringRepresentation_meshBaseName_maxLength_filter_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_netmeshbase_proxyLink_proxyName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewletAlternatives_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_netmeshbase_proxy_proxyName_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_netmeshbase_proxyIterate_meshBaseName_loopVar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_netmeshbase_notIfMeshBaseHasProxies_meshBaseName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewlet = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_netmeshbase_ifMeshBaseHasProxies_meshBaseName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_meshbase_meshBaseId_stringRepresentation_meshBaseName_maxLength_filter_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_netmeshbase_proxyLink_proxyName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewletAlternatives_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_netmeshbase_proxy_proxyName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_netmeshbase_proxyIterate_meshBaseName_loopVar.release();
    _jspx_tagPool_netmeshbase_notIfMeshBaseHasProxies_meshBaseName.release();
    _jspx_tagPool_v_viewlet.release();
    _jspx_tagPool_netmeshbase_ifMeshBaseHasProxies_meshBaseName.release();
    _jspx_tagPool_meshbase_meshBaseId_stringRepresentation_meshBaseName_maxLength_filter_nobody.release();
    _jspx_tagPool_netmeshbase_proxyLink_proxyName.release();
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
        out.write(" <h1>Proxies for NetMeshBase at: ");
        if (_jspx_meth_meshbase_meshBaseId_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("</h1>\n");
        out.write(" <table class=\"proxies\">\n");
        out.write("  <tbody>   \n");
        out.write("   <tr>\n");
        out.write("    ");
        if (_jspx_meth_netmeshbase_ifMeshBaseHasProxies_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_netmeshbase_notIfMeshBaseHasProxies_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   </tr>\n");
        out.write("  </tbody>\n");
        out.write(" </table>\n");
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

  private boolean _jspx_meth_meshbase_meshBaseId_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  meshbase:meshBaseId
    org.infogrid.jee.taglib.meshbase.MeshBaseIdentifierTag _jspx_th_meshbase_meshBaseId_0 = (org.infogrid.jee.taglib.meshbase.MeshBaseIdentifierTag) _jspx_tagPool_meshbase_meshBaseId_stringRepresentation_meshBaseName_maxLength_filter_nobody.get(org.infogrid.jee.taglib.meshbase.MeshBaseIdentifierTag.class);
    _jspx_th_meshbase_meshBaseId_0.setPageContext(_jspx_page_context);
    _jspx_th_meshbase_meshBaseId_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_meshbase_meshBaseId_0.setMeshBaseName("Subject.MeshBase");
    _jspx_th_meshbase_meshBaseId_0.setStringRepresentation("Plain");
    _jspx_th_meshbase_meshBaseId_0.setFilter("true");
    _jspx_th_meshbase_meshBaseId_0.setMaxLength(30);
    int _jspx_eval_meshbase_meshBaseId_0 = _jspx_th_meshbase_meshBaseId_0.doStartTag();
    if (_jspx_th_meshbase_meshBaseId_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_meshbase_meshBaseId_stringRepresentation_meshBaseName_maxLength_filter_nobody.reuse(_jspx_th_meshbase_meshBaseId_0);
      return true;
    }
    _jspx_tagPool_meshbase_meshBaseId_stringRepresentation_meshBaseName_maxLength_filter_nobody.reuse(_jspx_th_meshbase_meshBaseId_0);
    return false;
  }

  private boolean _jspx_meth_netmeshbase_ifMeshBaseHasProxies_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  netmeshbase:ifMeshBaseHasProxies
    org.infogrid.jee.taglib.meshbase.net.IfNetMeshBaseHasProxiesTag _jspx_th_netmeshbase_ifMeshBaseHasProxies_0 = (org.infogrid.jee.taglib.meshbase.net.IfNetMeshBaseHasProxiesTag) _jspx_tagPool_netmeshbase_ifMeshBaseHasProxies_meshBaseName.get(org.infogrid.jee.taglib.meshbase.net.IfNetMeshBaseHasProxiesTag.class);
    _jspx_th_netmeshbase_ifMeshBaseHasProxies_0.setPageContext(_jspx_page_context);
    _jspx_th_netmeshbase_ifMeshBaseHasProxies_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_netmeshbase_ifMeshBaseHasProxies_0.setMeshBaseName("Subject.MeshBase");
    int _jspx_eval_netmeshbase_ifMeshBaseHasProxies_0 = _jspx_th_netmeshbase_ifMeshBaseHasProxies_0.doStartTag();
    if (_jspx_eval_netmeshbase_ifMeshBaseHasProxies_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_netmeshbase_ifMeshBaseHasProxies_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_netmeshbase_ifMeshBaseHasProxies_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_netmeshbase_ifMeshBaseHasProxies_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("     <td width=\"33%\">\n");
        out.write("      Proxies towards:\n");
        out.write("     </td>\n");
        out.write("     <td>\n");
        out.write("      <ul>\n");
        out.write("       ");
        if (_jspx_meth_netmeshbase_proxyIterate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_netmeshbase_ifMeshBaseHasProxies_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("      </ul>\n");
        out.write("     </td>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_netmeshbase_ifMeshBaseHasProxies_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_netmeshbase_ifMeshBaseHasProxies_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_netmeshbase_ifMeshBaseHasProxies_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_netmeshbase_ifMeshBaseHasProxies_meshBaseName.reuse(_jspx_th_netmeshbase_ifMeshBaseHasProxies_0);
      return true;
    }
    _jspx_tagPool_netmeshbase_ifMeshBaseHasProxies_meshBaseName.reuse(_jspx_th_netmeshbase_ifMeshBaseHasProxies_0);
    return false;
  }

  private boolean _jspx_meth_netmeshbase_proxyIterate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_netmeshbase_ifMeshBaseHasProxies_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  netmeshbase:proxyIterate
    org.infogrid.jee.taglib.meshbase.net.ProxyIterateTag _jspx_th_netmeshbase_proxyIterate_0 = (org.infogrid.jee.taglib.meshbase.net.ProxyIterateTag) _jspx_tagPool_netmeshbase_proxyIterate_meshBaseName_loopVar.get(org.infogrid.jee.taglib.meshbase.net.ProxyIterateTag.class);
    _jspx_th_netmeshbase_proxyIterate_0.setPageContext(_jspx_page_context);
    _jspx_th_netmeshbase_proxyIterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_netmeshbase_ifMeshBaseHasProxies_0);
    _jspx_th_netmeshbase_proxyIterate_0.setMeshBaseName("Subject.MeshBase");
    _jspx_th_netmeshbase_proxyIterate_0.setLoopVar("currentProxy");
    int _jspx_eval_netmeshbase_proxyIterate_0 = _jspx_th_netmeshbase_proxyIterate_0.doStartTag();
    if (_jspx_eval_netmeshbase_proxyIterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_netmeshbase_proxyIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_netmeshbase_proxyIterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_netmeshbase_proxyIterate_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        <li>\n");
        out.write("         ");
        if (_jspx_meth_netmeshbase_proxyLink_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_netmeshbase_proxyIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        </li>\n");
        out.write("       ");
        int evalDoAfterBody = _jspx_th_netmeshbase_proxyIterate_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_netmeshbase_proxyIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_netmeshbase_proxyIterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_netmeshbase_proxyIterate_meshBaseName_loopVar.reuse(_jspx_th_netmeshbase_proxyIterate_0);
      return true;
    }
    _jspx_tagPool_netmeshbase_proxyIterate_meshBaseName_loopVar.reuse(_jspx_th_netmeshbase_proxyIterate_0);
    return false;
  }

  private boolean _jspx_meth_netmeshbase_proxyLink_0(javax.servlet.jsp.tagext.JspTag _jspx_th_netmeshbase_proxyIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  netmeshbase:proxyLink
    org.infogrid.jee.taglib.meshbase.net.ProxyLinkTag _jspx_th_netmeshbase_proxyLink_0 = (org.infogrid.jee.taglib.meshbase.net.ProxyLinkTag) _jspx_tagPool_netmeshbase_proxyLink_proxyName.get(org.infogrid.jee.taglib.meshbase.net.ProxyLinkTag.class);
    _jspx_th_netmeshbase_proxyLink_0.setPageContext(_jspx_page_context);
    _jspx_th_netmeshbase_proxyLink_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_netmeshbase_proxyIterate_0);
    _jspx_th_netmeshbase_proxyLink_0.setProxyName("currentProxy");
    int _jspx_eval_netmeshbase_proxyLink_0 = _jspx_th_netmeshbase_proxyLink_0.doStartTag();
    if (_jspx_eval_netmeshbase_proxyLink_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_netmeshbase_proxyLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_netmeshbase_proxyLink_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_netmeshbase_proxyLink_0.doInitBody();
      }
      do {
        if (_jspx_meth_netmeshbase_proxy_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_netmeshbase_proxyLink_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_netmeshbase_proxyLink_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_netmeshbase_proxyLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_netmeshbase_proxyLink_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_netmeshbase_proxyLink_proxyName.reuse(_jspx_th_netmeshbase_proxyLink_0);
      return true;
    }
    _jspx_tagPool_netmeshbase_proxyLink_proxyName.reuse(_jspx_th_netmeshbase_proxyLink_0);
    return false;
  }

  private boolean _jspx_meth_netmeshbase_proxy_0(javax.servlet.jsp.tagext.JspTag _jspx_th_netmeshbase_proxyLink_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  netmeshbase:proxy
    org.infogrid.jee.taglib.meshbase.net.ProxyTag _jspx_th_netmeshbase_proxy_0 = (org.infogrid.jee.taglib.meshbase.net.ProxyTag) _jspx_tagPool_netmeshbase_proxy_proxyName_nobody.get(org.infogrid.jee.taglib.meshbase.net.ProxyTag.class);
    _jspx_th_netmeshbase_proxy_0.setPageContext(_jspx_page_context);
    _jspx_th_netmeshbase_proxy_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_netmeshbase_proxyLink_0);
    _jspx_th_netmeshbase_proxy_0.setProxyName("currentProxy");
    int _jspx_eval_netmeshbase_proxy_0 = _jspx_th_netmeshbase_proxy_0.doStartTag();
    if (_jspx_th_netmeshbase_proxy_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_netmeshbase_proxy_proxyName_nobody.reuse(_jspx_th_netmeshbase_proxy_0);
      return true;
    }
    _jspx_tagPool_netmeshbase_proxy_proxyName_nobody.reuse(_jspx_th_netmeshbase_proxy_0);
    return false;
  }

  private boolean _jspx_meth_netmeshbase_notIfMeshBaseHasProxies_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  netmeshbase:notIfMeshBaseHasProxies
    org.infogrid.jee.taglib.meshbase.net.NotIfNetMeshBaseHasProxiesTag _jspx_th_netmeshbase_notIfMeshBaseHasProxies_0 = (org.infogrid.jee.taglib.meshbase.net.NotIfNetMeshBaseHasProxiesTag) _jspx_tagPool_netmeshbase_notIfMeshBaseHasProxies_meshBaseName.get(org.infogrid.jee.taglib.meshbase.net.NotIfNetMeshBaseHasProxiesTag.class);
    _jspx_th_netmeshbase_notIfMeshBaseHasProxies_0.setPageContext(_jspx_page_context);
    _jspx_th_netmeshbase_notIfMeshBaseHasProxies_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_netmeshbase_notIfMeshBaseHasProxies_0.setMeshBaseName("Subject.MeshBase");
    int _jspx_eval_netmeshbase_notIfMeshBaseHasProxies_0 = _jspx_th_netmeshbase_notIfMeshBaseHasProxies_0.doStartTag();
    if (_jspx_eval_netmeshbase_notIfMeshBaseHasProxies_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_netmeshbase_notIfMeshBaseHasProxies_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_netmeshbase_notIfMeshBaseHasProxies_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_netmeshbase_notIfMeshBaseHasProxies_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("     <td colspan=\"2\" style=\"text-align: center\">No Proxies.</td>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_netmeshbase_notIfMeshBaseHasProxies_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_netmeshbase_notIfMeshBaseHasProxies_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_netmeshbase_notIfMeshBaseHasProxies_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_netmeshbase_notIfMeshBaseHasProxies_meshBaseName.reuse(_jspx_th_netmeshbase_notIfMeshBaseHasProxies_0);
      return true;
    }
    _jspx_tagPool_netmeshbase_notIfMeshBaseHasProxies_meshBaseName.reuse(_jspx_th_netmeshbase_notIfMeshBaseHasProxies_0);
    return false;
  }
}
