package org.apache.jsp.s.templates.default_.text.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_refresh;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tmpl_ifErrors;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tmpl_inlineErrors_stringRepresentation_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tmpl_inline_sectionName_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_mesh_refresh = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tmpl_ifErrors = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tmpl_inlineErrors_stringRepresentation_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tmpl_inline_sectionName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_mesh_refresh.release();
    _jspx_tagPool_tmpl_ifErrors.release();
    _jspx_tagPool_tmpl_inlineErrors_stringRepresentation_nobody.release();
    _jspx_tagPool_tmpl_inline_sectionName_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">\n");
      out.write(" <head>\n");
      out.write("  ");
      if (_jspx_meth_tmpl_inline_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  ");
      if (_jspx_meth_tmpl_inline_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write("  <noscript>\n");
      out.write("   <div class=\"errors\">\n");
      out.write("    <h2>Errors:</h2>\n");
      out.write("    <p>This site requires Javascript. Please enable Javascript before attempting to proceed.</p>\n");
      out.write("   </div>\n");
      out.write("  </noscript>\n");
      out.write("  ");
      if (_jspx_meth_tmpl_ifErrors_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  ");
      if (_jspx_meth_mesh_refresh_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  ");
      if (_jspx_meth_tmpl_inline_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write(" </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_tmpl_inline_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tmpl:inline
    org.infogrid.jee.taglib.templates.InlineTag _jspx_th_tmpl_inline_0 = (org.infogrid.jee.taglib.templates.InlineTag) _jspx_tagPool_tmpl_inline_sectionName_nobody.get(org.infogrid.jee.taglib.templates.InlineTag.class);
    _jspx_th_tmpl_inline_0.setPageContext(_jspx_page_context);
    _jspx_th_tmpl_inline_0.setParent(null);
    _jspx_th_tmpl_inline_0.setSectionName("html-title");
    int _jspx_eval_tmpl_inline_0 = _jspx_th_tmpl_inline_0.doStartTag();
    if (_jspx_th_tmpl_inline_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tmpl_inline_sectionName_nobody.reuse(_jspx_th_tmpl_inline_0);
      return true;
    }
    _jspx_tagPool_tmpl_inline_sectionName_nobody.reuse(_jspx_th_tmpl_inline_0);
    return false;
  }

  private boolean _jspx_meth_tmpl_inline_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tmpl:inline
    org.infogrid.jee.taglib.templates.InlineTag _jspx_th_tmpl_inline_1 = (org.infogrid.jee.taglib.templates.InlineTag) _jspx_tagPool_tmpl_inline_sectionName_nobody.get(org.infogrid.jee.taglib.templates.InlineTag.class);
    _jspx_th_tmpl_inline_1.setPageContext(_jspx_page_context);
    _jspx_th_tmpl_inline_1.setParent(null);
    _jspx_th_tmpl_inline_1.setSectionName("html-head");
    int _jspx_eval_tmpl_inline_1 = _jspx_th_tmpl_inline_1.doStartTag();
    if (_jspx_th_tmpl_inline_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tmpl_inline_sectionName_nobody.reuse(_jspx_th_tmpl_inline_1);
      return true;
    }
    _jspx_tagPool_tmpl_inline_sectionName_nobody.reuse(_jspx_th_tmpl_inline_1);
    return false;
  }

  private boolean _jspx_meth_tmpl_ifErrors_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tmpl:ifErrors
    org.infogrid.jee.taglib.templates.IfErrorsTag _jspx_th_tmpl_ifErrors_0 = (org.infogrid.jee.taglib.templates.IfErrorsTag) _jspx_tagPool_tmpl_ifErrors.get(org.infogrid.jee.taglib.templates.IfErrorsTag.class);
    _jspx_th_tmpl_ifErrors_0.setPageContext(_jspx_page_context);
    _jspx_th_tmpl_ifErrors_0.setParent(null);
    int _jspx_eval_tmpl_ifErrors_0 = _jspx_th_tmpl_ifErrors_0.doStartTag();
    if (_jspx_eval_tmpl_ifErrors_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_tmpl_ifErrors_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_tmpl_ifErrors_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_tmpl_ifErrors_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("   <div class=\"errors\">\n");
        out.write("    ");
        if (_jspx_meth_tmpl_inlineErrors_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_tmpl_ifErrors_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   </div>\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_tmpl_ifErrors_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_tmpl_ifErrors_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_tmpl_ifErrors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tmpl_ifErrors.reuse(_jspx_th_tmpl_ifErrors_0);
      return true;
    }
    _jspx_tagPool_tmpl_ifErrors.reuse(_jspx_th_tmpl_ifErrors_0);
    return false;
  }

  private boolean _jspx_meth_tmpl_inlineErrors_0(javax.servlet.jsp.tagext.JspTag _jspx_th_tmpl_ifErrors_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tmpl:inlineErrors
    org.infogrid.jee.taglib.templates.InlineErrorsTag _jspx_th_tmpl_inlineErrors_0 = (org.infogrid.jee.taglib.templates.InlineErrorsTag) _jspx_tagPool_tmpl_inlineErrors_stringRepresentation_nobody.get(org.infogrid.jee.taglib.templates.InlineErrorsTag.class);
    _jspx_th_tmpl_inlineErrors_0.setPageContext(_jspx_page_context);
    _jspx_th_tmpl_inlineErrors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tmpl_ifErrors_0);
    _jspx_th_tmpl_inlineErrors_0.setStringRepresentation("Html");
    int _jspx_eval_tmpl_inlineErrors_0 = _jspx_th_tmpl_inlineErrors_0.doStartTag();
    if (_jspx_th_tmpl_inlineErrors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tmpl_inlineErrors_stringRepresentation_nobody.reuse(_jspx_th_tmpl_inlineErrors_0);
      return true;
    }
    _jspx_tagPool_tmpl_inlineErrors_stringRepresentation_nobody.reuse(_jspx_th_tmpl_inlineErrors_0);
    return false;
  }

  private boolean _jspx_meth_mesh_refresh_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:refresh
    org.infogrid.jee.taglib.mesh.RefreshTag _jspx_th_mesh_refresh_0 = (org.infogrid.jee.taglib.mesh.RefreshTag) _jspx_tagPool_mesh_refresh.get(org.infogrid.jee.taglib.mesh.RefreshTag.class);
    _jspx_th_mesh_refresh_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_refresh_0.setParent(null);
    int _jspx_eval_mesh_refresh_0 = _jspx_th_mesh_refresh_0.doStartTag();
    if (_jspx_eval_mesh_refresh_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Reload page");
        int evalDoAfterBody = _jspx_th_mesh_refresh_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_mesh_refresh_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_refresh.reuse(_jspx_th_mesh_refresh_0);
      return true;
    }
    _jspx_tagPool_mesh_refresh.reuse(_jspx_th_mesh_refresh_0);
    return false;
  }

  private boolean _jspx_meth_tmpl_inline_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tmpl:inline
    org.infogrid.jee.taglib.templates.InlineTag _jspx_th_tmpl_inline_2 = (org.infogrid.jee.taglib.templates.InlineTag) _jspx_tagPool_tmpl_inline_sectionName_nobody.get(org.infogrid.jee.taglib.templates.InlineTag.class);
    _jspx_th_tmpl_inline_2.setPageContext(_jspx_page_context);
    _jspx_th_tmpl_inline_2.setParent(null);
    _jspx_th_tmpl_inline_2.setSectionName("text-default");
    int _jspx_eval_tmpl_inline_2 = _jspx_th_tmpl_inline_2.doStartTag();
    if (_jspx_th_tmpl_inline_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tmpl_inline_sectionName_nobody.reuse(_jspx_th_tmpl_inline_2);
      return true;
    }
    _jspx_tagPool_tmpl_inline_sectionName_nobody.reuse(_jspx_th_tmpl_inline_2);
    return false;
  }
}
