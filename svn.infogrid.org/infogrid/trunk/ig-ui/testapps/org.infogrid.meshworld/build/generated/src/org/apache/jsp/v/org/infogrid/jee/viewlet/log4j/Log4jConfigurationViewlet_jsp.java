package org.apache.jsp.v.org.infogrid.jee.viewlet.log4j;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import org.infogrid.jee.viewlet.log4j.Log4jConfigurationViewlet;
import org.infogrid.util.logging.log4j.Log4jLog;

public final class Log4jConfigurationViewlet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewlet;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_u_safeForm_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tmpl_stylesheet_href_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewletAlternatives_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_v_viewlet = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_u_safeForm_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tmpl_stylesheet_href_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewletAlternatives_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_v_viewlet.release();
    _jspx_tagPool_u_safeForm_method_action.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_tmpl_stylesheet_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_v_viewletAlternatives_0(_jspx_page_context))
        return;
      out.write('\n');
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
          out.write(" <h1>Log4j Configuration</h1>\n");
          out.write(" ");
          //  u:safeForm
          org.infogrid.jee.taglib.util.SafeFormTag _jspx_th_u_safeForm_0 = (org.infogrid.jee.taglib.util.SafeFormTag) _jspx_tagPool_u_safeForm_method_action.get(org.infogrid.jee.taglib.util.SafeFormTag.class);
          _jspx_th_u_safeForm_0.setPageContext(_jspx_page_context);
          _jspx_th_u_safeForm_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
          _jspx_th_u_safeForm_0.setMethod("post");
          _jspx_th_u_safeForm_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Viewlet.postUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          int _jspx_eval_u_safeForm_0 = _jspx_th_u_safeForm_0.doStartTag();
          if (_jspx_eval_u_safeForm_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("  <table class=\"log4j\">\n");
              out.write("   <thead>\n");
              out.write("    <tr>\n");
              out.write("     <th>Logger name</th>\n");
              out.write("     <th>Logging level</th>\n");
              out.write("    </tr>\n");
              out.write("   </thead>\n");
              out.write("   <tbody>\n");


Log4jConfigurationViewlet vl = (Log4jConfigurationViewlet) request.getAttribute( "Viewlet" );
Iterator<Log4jLog> iter = vl.loggerIterator();
while( iter.hasNext() ) {
    Log4jLog current = iter.next();
    Log4jConfigurationViewlet.LEVEL currentLevel
            = current.getDelegate().getLevel() != null ? Log4jConfigurationViewlet.LEVEL.valueOf( current.getDelegate().getLevel().toString() ) : null;
 
              out.write("\n");
              out.write("    <tr>\n");
              out.write("     <td class=\"name\">");
              out.print( current.getDelegate().getName() );
              out.write("</td>\n");
              out.write("     <td class=\"value\">\n");
              out.write("      <select name=\"field-");
              out.print( current.getDelegate().getName() );
              out.write("\">\n");
              out.write("       <option>parent</option>\n");

    for( Log4jConfigurationViewlet.LEVEL l : Log4jConfigurationViewlet.LEVEL.values() ) {
        if( currentLevel == l ) {
 
              out.write("\n");
              out.write(" <option selected=\"selected\">");
              out.print( l );
              out.write("</option>\n");

        } else {
 
              out.write("\n");
              out.write(" <option>");
              out.print( l );
              out.write("</option>\n");

        }
    }
 
              out.write("\n");
              out.write("      </select>\n");
              out.write("     </td>\n");
              out.write("    </tr>\n");

}
 
              out.write("\n");
              out.write("    <tr>\n");
              out.write("     <td colspan=\"2\">\n");
              out.write("      <div class=\"dialog-buttons\">\n");
              out.write("       <table class=\"dialog-buttons\">\n");
              out.write("        <tr>\n");
              out.write("         <td><input type=\"submit\" value=\"Change\"/></td>\n");
              out.write("        </tr>\n");
              out.write("       </table>\n");
              out.write("      </div>\n");
              out.write("     </td>\n");
              out.write("    </tr>\n");
              out.write("   </tbody>\n");
              out.write("  </table>\n");
              out.write(" ");
              int evalDoAfterBody = _jspx_th_u_safeForm_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_u_safeForm_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_u_safeForm_method_action.reuse(_jspx_th_u_safeForm_0);
            return;
          }
          _jspx_tagPool_u_safeForm_method_action.reuse(_jspx_th_u_safeForm_0);
          out.write('\n');
          int evalDoAfterBody = _jspx_th_v_viewlet_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_v_viewlet_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_v_viewlet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_v_viewlet.reuse(_jspx_th_v_viewlet_0);
        return;
      }
      _jspx_tagPool_v_viewlet.reuse(_jspx_th_v_viewlet_0);
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
    _jspx_th_tmpl_stylesheet_0.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}/v/org/infogrid/jee/viewlet/log4j/Log4jConfigurationViewlet.css", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
}
