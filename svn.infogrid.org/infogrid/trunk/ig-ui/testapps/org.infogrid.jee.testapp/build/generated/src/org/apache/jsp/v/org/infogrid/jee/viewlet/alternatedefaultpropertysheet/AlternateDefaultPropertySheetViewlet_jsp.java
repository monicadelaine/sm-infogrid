package org.apache.jsp.v.org.infogrid.jee.viewlet.alternatedefaultpropertysheet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.infogrid.model.primitives.BlobDataType;
import org.infogrid.model.primitives.BooleanDataType;
import org.infogrid.model.primitives.ColorDataType;
import org.infogrid.model.primitives.CurrencyDataType;
import org.infogrid.model.primitives.DataType;
import org.infogrid.model.primitives.EnumeratedDataType;
import org.infogrid.model.primitives.ExtentDataType;
import org.infogrid.model.primitives.FloatDataType;
import org.infogrid.model.primitives.IntegerDataType;
import org.infogrid.model.primitives.MultiplicityDataType;
import org.infogrid.model.primitives.PointDataType;
import org.infogrid.model.primitives.PropertyType;
import org.infogrid.model.primitives.StringDataType;
import org.infogrid.model.primitives.TimePeriodDataType;
import org.infogrid.model.primitives.TimeStampDataType;

public final class AlternateDefaultPropertySheetViewlet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/v/org/infogrid/jee/viewlet/alternatedefaultpropertysheet/AlternateDefaultPropertySheetViewlet/attributes.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tmpl_script_src_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_meshTypeId_meshTypeName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tmpl_stylesheet_href_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewlet_formId;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_property_state_propertyTypeName_meshObjectName_ignore_defaultValue_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_changeViewletState_viewletStates_display_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_ifState_viewletState;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_u_callJspoParam_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_notIfState_viewletState;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_u_safeFormHiddenInput_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_type_meshTypeName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_viewletAlternatives_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tmpl_script_src_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_meshTypeId_meshTypeName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tmpl_stylesheet_href_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewlet_formId = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_property_state_propertyTypeName_meshObjectName_ignore_defaultValue_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_changeViewletState_viewletStates_display_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_ifState_viewletState = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_u_callJspoParam_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_notIfState_viewletState = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_u_safeFormHiddenInput_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_type_meshTypeName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_viewletAlternatives_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.release();
    _jspx_tagPool_tmpl_script_src_nobody.release();
    _jspx_tagPool_mesh_meshTypeId_meshTypeName_nobody.release();
    _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.release();
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody.release();
    _jspx_tagPool_u_callJspo_submitLabel_page_linkTitle_action.release();
    _jspx_tagPool_tmpl_stylesheet_href_nobody.release();
    _jspx_tagPool_v_viewlet_formId.release();
    _jspx_tagPool_mesh_property_state_propertyTypeName_meshObjectName_ignore_defaultValue_nobody.release();
    _jspx_tagPool_v_changeViewletState_viewletStates_display_nobody.release();
    _jspx_tagPool_v_ifState_viewletState.release();
    _jspx_tagPool_u_callJspoParam_value_name_nobody.release();
    _jspx_tagPool_v_notIfState_viewletState.release();
    _jspx_tagPool_u_safeFormHiddenInput_nobody.release();
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
      if (_jspx_meth_tmpl_stylesheet_1(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_tmpl_stylesheet_2(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_tmpl_script_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_v_viewletAlternatives_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_v_changeViewletState_0(_jspx_page_context))
        return;
      out.write('\n');
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
          out.write(" <table class=\"audit\"> <!-- IE is unable to render float:right correctly, so here is a table for you -->\n");
          out.write("  <tr>\n");
          out.write("   <td class=\"title\">\n");
          out.write("    ");
          if (_jspx_meth_v_notIfState_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    <h1>Alternate default Property Sheet for: ");
          if (_jspx_meth_mesh_meshObjectId_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
            return;
          out.write("</h1>\n");
          out.write("   </td>\n");
          out.write("  </tr>\n");
          out.write(" </table>\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write(" <table class=\"attributes\">\n");
          out.write("  <thead>\n");
          out.write("   <tr>\n");
          out.write("    <th class=\"type\">\n");
          out.write("     ");
          if (_jspx_meth_v_notIfState_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("     Type\n");
          out.write("    </th>\n");
          out.write("    <th>Property</th>\n");
          out.write("    <th>Value</th>\n");
          out.write("   </tr>\n");
          out.write("  </thead>\n");
          out.write("  <tbody>\n");
          out.write("   ");
          //  mesh:blessedByIterate
          org.infogrid.jee.taglib.mesh.MeshObjectBlessedByIterateTag _jspx_th_mesh_blessedByIterate_0 = (org.infogrid.jee.taglib.mesh.MeshObjectBlessedByIterateTag) _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.get(org.infogrid.jee.taglib.mesh.MeshObjectBlessedByIterateTag.class);
          _jspx_th_mesh_blessedByIterate_0.setPageContext(_jspx_page_context);
          _jspx_th_mesh_blessedByIterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
          _jspx_th_mesh_blessedByIterate_0.setMeshObjectName("Subject");
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
              out.write("    <tr>\n");
              out.write("     <th class=\"entityType\" colspan=\"3\">\n");
              out.write("      ");
              if (_jspx_meth_v_notIfState_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_blessedByIterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("      ");
              if (_jspx_meth_mesh_type_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_blessedByIterate_0, _jspx_page_context))
                return;
              out.write(' ');
              if (_jspx_meth_mesh_meshTypeId_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_blessedByIterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("     </th>\n");
              out.write("    </tr>\n");
              out.write("    ");
              //  mesh:propertyIterate
              org.infogrid.jee.taglib.mesh.MeshObjectPropertyIterateTag _jspx_th_mesh_propertyIterate_0 = (org.infogrid.jee.taglib.mesh.MeshObjectPropertyIterateTag) _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.get(org.infogrid.jee.taglib.mesh.MeshObjectPropertyIterateTag.class);
              _jspx_th_mesh_propertyIterate_0.setPageContext(_jspx_page_context);
              _jspx_th_mesh_propertyIterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_blessedByIterate_0);
              _jspx_th_mesh_propertyIterate_0.setMeshObjectName("Subject");
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
                  out.write("     <tr>\n");
                  out.write("      <th class=\"type\"></th>\n");
                  out.write("      <td class=\"name\">");
                  if (_jspx_meth_mesh_type_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_propertyIterate_0, _jspx_page_context))
                    return;
                  out.write("</td>\n");
                  out.write("      <td class=\"value\">\n");

    String       altDefault = "Hmmm...";
    PropertyType propType = (PropertyType) request.getAttribute( "propertyType" );
    DataType     type     = propType.getDataType();

    if( type instanceof BlobDataType ) {
        altDefault = "UnusualBlobDefault";

    } else if( type instanceof BooleanDataType ) {
        altDefault = "TRUE";

    } else if( type instanceof ColorDataType ) {
        altDefault = "#123456";

    } else if( type instanceof CurrencyDataType ) {
        altDefault = "$99.88";

    } else if( type instanceof EnumeratedDataType ) {
        altDefault = "Value3";

    } else if( type instanceof ExtentDataType ) {
        altDefault = "(99;88)";

    } else if( type instanceof FloatDataType ) {
        altDefault = "99.88";

    } else if( type instanceof IntegerDataType ) {
        altDefault = "99";

    } else if( type instanceof MultiplicityDataType ) {
        altDefault = "88..99";

    } else if( type instanceof PointDataType ) {
        altDefault = "(88;99)";

    } else if( type instanceof StringDataType ) {
        altDefault = "99.88.99.88";

    } else if( type instanceof TimePeriodDataType ) {
        altDefault = "99 years, 88 months, 77 days, 66 hours, 55 minutes, 44.333 seconds";

    } else if( type instanceof TimeStampDataType ) {
        altDefault = "08:08:08.088 1999/11/11 UTC";

    }

                  out.write("\n");
                  out.write("          \n");
                  out.write("       ");
                  //  mesh:property
                  org.infogrid.jee.taglib.mesh.PropertyTag _jspx_th_mesh_property_0 = (org.infogrid.jee.taglib.mesh.PropertyTag) _jspx_tagPool_mesh_property_state_propertyTypeName_meshObjectName_ignore_defaultValue_nobody.get(org.infogrid.jee.taglib.mesh.PropertyTag.class);
                  _jspx_th_mesh_property_0.setPageContext(_jspx_page_context);
                  _jspx_th_mesh_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_propertyIterate_0);
                  _jspx_th_mesh_property_0.setMeshObjectName("Subject");
                  _jspx_th_mesh_property_0.setPropertyTypeName("propertyType");
                  _jspx_th_mesh_property_0.setIgnore("true");
                  _jspx_th_mesh_property_0.setState((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Viewlet.viewletState.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  _jspx_th_mesh_property_0.setDefaultValue( altDefault );
                  int _jspx_eval_mesh_property_0 = _jspx_th_mesh_property_0.doStartTag();
                  if (_jspx_th_mesh_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_mesh_property_state_propertyTypeName_meshObjectName_ignore_defaultValue_nobody.reuse(_jspx_th_mesh_property_0);
                    return;
                  }
                  _jspx_tagPool_mesh_property_state_propertyTypeName_meshObjectName_ignore_defaultValue_nobody.reuse(_jspx_th_mesh_property_0);
                  out.write("\n");
                  out.write("      </td>\n");
                  out.write("     </tr>\n");
                  out.write("    ");
                  int evalDoAfterBody = _jspx_th_mesh_propertyIterate_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_mesh_propertyIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_mesh_propertyIterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.reuse(_jspx_th_mesh_propertyIterate_0);
                return;
              }
              _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.reuse(_jspx_th_mesh_propertyIterate_0);
              out.write("\n");
              out.write("   ");
              int evalDoAfterBody = _jspx_th_mesh_blessedByIterate_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mesh_blessedByIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_mesh_blessedByIterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.reuse(_jspx_th_mesh_blessedByIterate_0);
            return;
          }
          _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.reuse(_jspx_th_mesh_blessedByIterate_0);
          out.write("\n");
          out.write("  </tbody>\n");
          out.write(" </table>\n");
          out.write("\n");
          out.write("\n");
          out.write(" ");
          if (_jspx_meth_v_ifState_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_viewlet_0, _jspx_page_context))
            return;
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
        return;
      }
      _jspx_tagPool_v_viewlet_formId.reuse(_jspx_th_v_viewlet_0);
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
    _jspx_th_tmpl_stylesheet_0.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}/v/org/infogrid/jee/viewlet/alternatedefaultpropertysheet/AlternateDefaultPropertySheetViewlet.css", java.lang.String.class, (PageContext)_jspx_page_context, null));
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

  private boolean _jspx_meth_v_notIfState_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:notIfState
    org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag _jspx_th_v_notIfState_0 = (org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag) _jspx_tagPool_v_notIfState_viewletState.get(org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag.class);
    _jspx_th_v_notIfState_0.setPageContext(_jspx_page_context);
    _jspx_th_v_notIfState_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_v_notIfState_0.setViewletState("edit");
    int _jspx_eval_v_notIfState_0 = _jspx_th_v_notIfState_0.doStartTag();
    if (_jspx_eval_v_notIfState_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("     <div class=\"slide-in-button\">\n");
        out.write("      ");
        if (_jspx_meth_u_callJspo_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_notIfState_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("     </div>\n");
        out.write("    ");
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
    _jspx_th_u_callJspo_0.setPage("/o/delete.jspo");
    _jspx_th_u_callJspo_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Viewlet.postUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_u_callJspo_0.setLinkTitle("Delete this MeshObject");
    _jspx_th_u_callJspo_0.setSubmitLabel("Delete");
    int _jspx_eval_u_callJspo_0 = _jspx_th_u_callJspo_0.doStartTag();
    if (_jspx_eval_u_callJspo_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_u_callJspo_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_u_callJspo_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_u_callJspo_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("       ");
        if (_jspx_meth_u_callJspoParam_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_u_callJspo_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("       <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/s/images/bin_closed.png\" alt=\"Delete\" />\n");
        out.write("      ");
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
    _jspx_th_u_callJspoParam_0.setName("toDelete");
    _jspx_th_u_callJspoParam_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Subject}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_u_callJspoParam_0 = _jspx_th_u_callJspoParam_0.doStartTag();
    if (_jspx_th_u_callJspoParam_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_0);
      return true;
    }
    _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_0);
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

  private boolean _jspx_meth_v_notIfState_1(javax.servlet.jsp.tagext.JspTag _jspx_th_v_viewlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:notIfState
    org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag _jspx_th_v_notIfState_1 = (org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag) _jspx_tagPool_v_notIfState_viewletState.get(org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag.class);
    _jspx_th_v_notIfState_1.setPageContext(_jspx_page_context);
    _jspx_th_v_notIfState_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_viewlet_0);
    _jspx_th_v_notIfState_1.setViewletState("edit");
    int _jspx_eval_v_notIfState_1 = _jspx_th_v_notIfState_1.doStartTag();
    if (_jspx_eval_v_notIfState_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("      <div class=\"slide-in-button\">\n");
        out.write("       ");
        if (_jspx_meth_u_callJspo_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_notIfState_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("      </div>\n");
        out.write("     ");
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
    _jspx_th_u_callJspo_1.setPage("/o/bless.jspo");
    _jspx_th_u_callJspo_1.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Viewlet.postUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_u_callJspo_1.setLinkTitle("Bless this MeshObject");
    _jspx_th_u_callJspo_1.setSubmitLabel("Bless");
    int _jspx_eval_u_callJspo_1 = _jspx_th_u_callJspo_1.doStartTag();
    if (_jspx_eval_u_callJspo_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_u_callJspo_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_u_callJspo_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_u_callJspo_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_u_callJspoParam_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_u_callJspo_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/s/images/medal_bronze_add.png\" alt=\"Bless\" />\n");
        out.write("       ");
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
    _jspx_th_u_callJspoParam_1.setName("toBless");
    _jspx_th_u_callJspoParam_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Subject}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_u_callJspoParam_1 = _jspx_th_u_callJspoParam_1.doStartTag();
    if (_jspx_th_u_callJspoParam_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_1);
      return true;
    }
    _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_1);
    return false;
  }

  private boolean _jspx_meth_v_notIfState_2(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_blessedByIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:notIfState
    org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag _jspx_th_v_notIfState_2 = (org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag) _jspx_tagPool_v_notIfState_viewletState.get(org.infogrid.jee.taglib.viewlet.NotIfViewletStateTag.class);
    _jspx_th_v_notIfState_2.setPageContext(_jspx_page_context);
    _jspx_th_v_notIfState_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_blessedByIterate_0);
    _jspx_th_v_notIfState_2.setViewletState("edit");
    int _jspx_eval_v_notIfState_2 = _jspx_th_v_notIfState_2.doStartTag();
    if (_jspx_eval_v_notIfState_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("       <div class=\"slide-in-button\">\n");
        out.write("        ");
        if (_jspx_meth_u_callJspo_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_notIfState_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("       </div>\n");
        out.write("      ");
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
    _jspx_th_u_callJspo_2.setPage("/o/unbless.jspo");
    _jspx_th_u_callJspo_2.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Viewlet.postUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_u_callJspo_2.setLinkTitle("Unbless this MeshObject");
    _jspx_th_u_callJspo_2.setSubmitLabel("Unbless");
    int _jspx_eval_u_callJspo_2 = _jspx_th_u_callJspo_2.doStartTag();
    if (_jspx_eval_u_callJspo_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_u_callJspo_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_u_callJspo_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_u_callJspo_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("         ");
        if (_jspx_meth_u_callJspoParam_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_u_callJspo_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("         ");
        if (_jspx_meth_u_callJspoParam_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_u_callJspo_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("         <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CONTEXT}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/s/images/medal_bronze_delete.png\" alt=\"Unbless\" />\n");
        out.write("        ");
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

  private boolean _jspx_meth_u_callJspoParam_2(javax.servlet.jsp.tagext.JspTag _jspx_th_u_callJspo_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:callJspoParam
    org.infogrid.jee.taglib.util.CallJspoParamTag _jspx_th_u_callJspoParam_2 = (org.infogrid.jee.taglib.util.CallJspoParamTag) _jspx_tagPool_u_callJspoParam_value_name_nobody.get(org.infogrid.jee.taglib.util.CallJspoParamTag.class);
    _jspx_th_u_callJspoParam_2.setPageContext(_jspx_page_context);
    _jspx_th_u_callJspoParam_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_u_callJspo_2);
    _jspx_th_u_callJspoParam_2.setName("toUnbless");
    _jspx_th_u_callJspoParam_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Subject}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_u_callJspoParam_2 = _jspx_th_u_callJspoParam_2.doStartTag();
    if (_jspx_th_u_callJspoParam_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_2);
      return true;
    }
    _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_2);
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
    _jspx_th_u_callJspoParam_3.setName("type");
    _jspx_th_u_callJspoParam_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blessedBy}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_u_callJspoParam_3 = _jspx_th_u_callJspoParam_3.doStartTag();
    if (_jspx_th_u_callJspoParam_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_3);
      return true;
    }
    _jspx_tagPool_u_callJspoParam_value_name_nobody.reuse(_jspx_th_u_callJspoParam_3);
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

  private boolean _jspx_meth_mesh_meshTypeId_0(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_blessedByIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshTypeId
    org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag _jspx_th_mesh_meshTypeId_0 = (org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag) _jspx_tagPool_mesh_meshTypeId_meshTypeName_nobody.get(org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag.class);
    _jspx_th_mesh_meshTypeId_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshTypeId_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_blessedByIterate_0);
    _jspx_th_mesh_meshTypeId_0.setMeshTypeName("blessedBy");
    int _jspx_eval_mesh_meshTypeId_0 = _jspx_th_mesh_meshTypeId_0.doStartTag();
    if (_jspx_th_mesh_meshTypeId_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_meshTypeId_meshTypeName_nobody.reuse(_jspx_th_mesh_meshTypeId_0);
      return true;
    }
    _jspx_tagPool_mesh_meshTypeId_meshTypeName_nobody.reuse(_jspx_th_mesh_meshTypeId_0);
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
        out.write("  <div class=\"dialog-buttons\">\n");
        out.write("   ");
        if (_jspx_meth_u_safeFormHiddenInput_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_v_ifState_0, _jspx_page_context))
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

  private boolean _jspx_meth_u_safeFormHiddenInput_0(javax.servlet.jsp.tagext.JspTag _jspx_th_v_ifState_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:safeFormHiddenInput
    org.infogrid.jee.taglib.util.SafeFormHiddenInputTag _jspx_th_u_safeFormHiddenInput_0 = (org.infogrid.jee.taglib.util.SafeFormHiddenInputTag) _jspx_tagPool_u_safeFormHiddenInput_nobody.get(org.infogrid.jee.taglib.util.SafeFormHiddenInputTag.class);
    _jspx_th_u_safeFormHiddenInput_0.setPageContext(_jspx_page_context);
    _jspx_th_u_safeFormHiddenInput_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_v_ifState_0);
    int _jspx_eval_u_safeFormHiddenInput_0 = _jspx_th_u_safeFormHiddenInput_0.doStartTag();
    if (_jspx_th_u_safeFormHiddenInput_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_safeFormHiddenInput_nobody.reuse(_jspx_th_u_safeFormHiddenInput_0);
      return true;
    }
    _jspx_tagPool_u_safeFormHiddenInput_nobody.reuse(_jspx_th_u_safeFormHiddenInput_0);
    return false;
  }
}
