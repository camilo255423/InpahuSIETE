
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
<<<<<<< HEAD
object admin extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
=======
object admin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Permiso],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(permisos:List[Permiso]):play.api.templates.HtmlFormat.Appendable = {
>>>>>>> 4d44da7d489b48f84b12a1a6b3ad9e4d2caf1200
        _display_ {

Seq[Any](format.raw/*1.26*/("""
"""),_display_(Seq[Any](/*2.2*/main("")/*2.10*/{_display_(Seq[Any](format.raw/*2.11*/("""
<div class="tabs" style="position: absolute; left: 300px;">
		<ul>
			<li><a href="#tabs-admin">Administración de Permisos</a></li>
		
			
		</ul>
 	<div id="tabs-admin">      

<table id="tabla">
<tr>
<td><b>Usuario</b></td><td><b>Rol</b></td><td><b>Programa</b></td><td><b>Operación</b></td>
</tr>
<tr>
<td width='220'><input id='inputusuario' name="location" class="autocomplete-relation" data-url='autocompleteLabel' size='40'/></td>
<td><select name="listaroles" id='listaroles'><option value='1'>ADMINISTRADOR</option><option value='2'>DIRECTOR DE PROGRAMA</option></select></td>
<td><b>"""),_display_(Seq[Any](/*18.9*/listaprogramas(Programa.findAll(),0))),format.raw/*18.45*/("""</b></td>
<td><a href="javascript: void(0)" 
	 id="adicionar"
	 >Adicionar</a></td>
</tr>
"""),_display_(Seq[Any](/*23.2*/for(permiso <- permisos) yield /*23.26*/{_display_(Seq[Any](format.raw/*23.27*/("""
<tr>
	<td>"""),_display_(Seq[Any](/*25.7*/permiso/*25.14*/.getUsuario().getNombre())),format.raw/*25.39*/("""</td>
	<td>"""),_display_(Seq[Any](/*26.7*/permiso/*26.14*/.getUsuario().getNombreRol())),format.raw/*26.42*/("""</td>
	<td>"""),_display_(Seq[Any](/*27.7*/if(permiso.getPrograma()!=null)/*27.38*/{_display_(Seq[Any](format.raw/*27.39*/("""
	"""),_display_(Seq[Any](/*28.3*/permiso/*28.10*/.getPrograma().getCodPrograma())),format.raw/*28.41*/(""" """),_display_(Seq[Any](/*28.43*/permiso/*28.50*/.getPrograma().getNombre())),format.raw/*28.76*/("""
	""")))})),format.raw/*29.3*/("""
	</td>
	<td><a href="javascript: void(0)" data-documento='"""),_display_(Seq[Any](/*31.53*/permiso/*31.60*/.getUsuario().getDocumento())),format.raw/*31.88*/("""'
	 class="eliminar"
	 >Eliminar</a></td>
</tr>
""")))})),format.raw/*35.2*/("""
</table>
</div><!-- tab admin -->
</div><!-- tabs -->
<div id="errorDialog" title="Error">
</div>
<div id="confirmDialog" title="Eliminar Permiso">
</div>

""")))})),format.raw/*44.2*/("""
<script>
var fila;
var nuevaFila; 

$('input.autocomplete-relation').each( function() """),format.raw/*49.51*/("""{"""),format.raw/*49.52*/("""
   var $input = $(this);

   // Create a hidden input with the same form control name to submit the value.
   var controlName = $input.attr('name');
   var $hidden = $('<input type="hidden" id="nuevodocumento" />').attr('name', controlName);
   $input.after($hidden).attr('name', controlName + '_label');

   // Set-up the autocomplete widget.
   var serverUrl = $input.data('url');
   $(this).autocomplete("""),format.raw/*59.25*/("""{"""),format.raw/*59.26*/("""
      source: serverUrl,
      focus: function(event, ui) """),format.raw/*61.34*/("""{"""),format.raw/*61.35*/("""
         // Set the text input value to the focused item's label, instead of the value.
         $input.val(ui.item.label);
         return false;
      """),format.raw/*65.7*/("""}"""),format.raw/*65.8*/(""",
      select: function(event, ui) """),format.raw/*66.35*/("""{"""),format.raw/*66.36*/("""
         // Save the selection item and value in the two inputs.
         $input.val(ui.item.label);
         $hidden.val(ui.item.value);
         
         return false;
      """),format.raw/*72.7*/("""}"""),format.raw/*72.8*/("""
   """),format.raw/*73.4*/("""}"""),format.raw/*73.5*/(""");
"""),format.raw/*74.1*/("""}"""),format.raw/*74.2*/(""");
$('#inputusuario').on('keydown',function(e)
"""),format.raw/*76.1*/("""{"""),format.raw/*76.2*/("""
var code = e.which; 
    if(code==13) e.preventDefault();
    if(code!=32 && code!=13 && code!=188 && code!=186)"""),format.raw/*79.55*/("""{"""),format.raw/*79.56*/("""
      $('#nuevodocumento').val("-1");  
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/(""" 

"""),format.raw/*83.1*/("""}"""),format.raw/*83.2*/("""	
);
$('form').submit(function() """),format.raw/*85.29*/("""{"""),format.raw/*85.30*/("""
   $(this).find('input.autocomplete-relation').attr('disabled', 'disabled');
"""),format.raw/*87.1*/("""}"""),format.raw/*87.2*/(""");
$('#adicionar').on("click",function()
"""),format.raw/*89.1*/("""{"""),format.raw/*89.2*/("""
var codigoPrograma=0;
var nombreRol=$('#listaroles option:selected').text();
var idRol=$('#listaroles').val();
var usuario=$('#inputusuario').val();
var nombrePrograma="";
var documento=0;
var error=0;

	if($('#nuevodocumento').val()!='-1')
	"""),format.raw/*99.2*/("""{"""),format.raw/*99.3*/("""
	documento=$('#nuevodocumento').val();
		if($('#listaProfesores').css('display')!='none')
		"""),format.raw/*102.3*/("""{"""),format.raw/*102.4*/("""
			
			if($('#listaProfesores').val()=='-1')
			"""),format.raw/*105.4*/("""{"""),format.raw/*105.5*/("""
		
		    $("#errorDialog").dialog("""),format.raw/*107.32*/("""{"""),format.raw/*107.33*/("""
		      modal: true,
		      title: "Adicionar permiso",
		      buttons: """),format.raw/*110.18*/("""{"""),format.raw/*110.19*/("""
		        Aceptar: function() """),format.raw/*111.31*/("""{"""),format.raw/*111.32*/("""
		          $( this ).dialog( "close" );
		        """),format.raw/*113.11*/("""}"""),format.raw/*113.12*/("""
		      """),format.raw/*114.9*/("""}"""),format.raw/*114.10*/("""
		    """),format.raw/*115.7*/("""}"""),format.raw/*115.8*/(""");
		$("#errorDialog").html("<p>Por favor seleccione un programa.</p>");
			error=1;
			"""),format.raw/*118.4*/("""}"""),format.raw/*118.5*/("""
			else
			"""),format.raw/*120.4*/("""{"""),format.raw/*120.5*/("""
			codigoPrograma = $('#listaProfesores').val();
			nombrePrograma = $('#listaProfesores option:selected').text();
			"""),format.raw/*123.4*/("""}"""),format.raw/*123.5*/("""
		"""),format.raw/*124.3*/("""}"""),format.raw/*124.4*/("""
	"""),format.raw/*125.2*/("""}"""),format.raw/*125.3*/("""
	else
	"""),format.raw/*127.2*/("""{"""),format.raw/*127.3*/("""
		$("#errorDialog").dialog("""),format.raw/*128.28*/("""{"""),format.raw/*128.29*/("""
		      modal: true,
		      title: "Adicionar permiso",
		      buttons: """),format.raw/*131.18*/("""{"""),format.raw/*131.19*/("""
		        Aceptar: function() """),format.raw/*132.31*/("""{"""),format.raw/*132.32*/("""
		          $( this ).dialog( "close" );
		        """),format.raw/*134.11*/("""}"""),format.raw/*134.12*/("""
		      """),format.raw/*135.9*/("""}"""),format.raw/*135.10*/("""
		    """),format.raw/*136.7*/("""}"""),format.raw/*136.8*/(""");
		$("#errorDialog").html("<p>Por favor seleccione un usuario.</p>");
		error=1;
	"""),format.raw/*139.2*/("""}"""),format.raw/*139.3*/("""
	if(error==0)
	"""),format.raw/*141.2*/("""{"""),format.raw/*141.3*/("""
	nuevaFila = "<tr><td>"+usuario+"</td><td>"+nombreRol+"</td><td>"+nombrePrograma+"</td><td>"+
	"<a href='javascript: void(0)' data-documento='"+documento+"' class='eliminar'"+
	 ">Eliminar</a></td>";
	$.post("insertarpermiso","""),format.raw/*145.27*/("""{"""),format.raw/*145.28*/("""documento: documento, idRol: idRol, codigoPrograma: codigoPrograma"""),format.raw/*145.94*/("""}"""),format.raw/*145.95*/(""", adicionar);
	"""),format.raw/*146.2*/("""}"""),format.raw/*146.3*/("""
"""),format.raw/*147.1*/("""}"""),format.raw/*147.2*/("""
);
$('#listaProfesores').hide();
$('#nuevodocumento').val('-1');
$('#listaroles').on('change', function()"""),format.raw/*151.41*/("""{"""),format.raw/*151.42*/("""
	if($('#listaroles').val()==1)
	"""),format.raw/*153.2*/("""{"""),format.raw/*153.3*/("""
	$('#listaProfesores').hide();
	"""),format.raw/*155.2*/("""}"""),format.raw/*155.3*/("""
	else
	"""),format.raw/*157.2*/("""{"""),format.raw/*157.3*/("""
	$('#listaProfesores').show();
	"""),format.raw/*159.2*/("""}"""),format.raw/*159.3*/("""

"""),format.raw/*161.1*/("""}"""),format.raw/*161.2*/("""
);
$('.eliminar').on("click",function()"""),format.raw/*163.37*/("""{"""),format.raw/*163.38*/("""
  var documento = $(this).attr('data-documento');
	fila = $(this);


	$( "#confirmDialog" ).dialog("""),format.raw/*168.31*/("""{"""),format.raw/*168.32*/("""
      resizable: false,
      height:240,
      modal: true,
      buttons: """),format.raw/*172.16*/("""{"""),format.raw/*172.17*/("""
        Eliminar: function() """),format.raw/*173.30*/("""{"""),format.raw/*173.31*/("""
        
        $.post("borrarpermiso","""),format.raw/*175.32*/("""{"""),format.raw/*175.33*/("""documento: documento"""),format.raw/*175.53*/("""}"""),format.raw/*175.54*/(""", borrar); 
          $( this ).dialog( "close" );
        """),format.raw/*177.9*/("""}"""),format.raw/*177.10*/(""",
        Cancelar: function() """),format.raw/*178.30*/("""{"""),format.raw/*178.31*/("""
          $( this ).dialog( "close" );
        """),format.raw/*180.9*/("""}"""),format.raw/*180.10*/("""
      """),format.raw/*181.7*/("""}"""),format.raw/*181.8*/("""
    """),format.raw/*182.5*/("""}"""),format.raw/*182.6*/(""");
    $("#confirmDialog").html("<p>Va a Eliminar este permiso.</p>");
  

"""),format.raw/*186.1*/("""}"""),format.raw/*186.2*/("""
);

function borrar(data)
"""),format.raw/*190.1*/("""{"""),format.raw/*190.2*/("""
if(data=="ok")
"""),format.raw/*192.1*/("""{"""),format.raw/*192.2*/("""
fila.parent().parent().remove();
"""),format.raw/*194.1*/("""}"""),format.raw/*194.2*/("""
else
"""),format.raw/*196.1*/("""{"""),format.raw/*196.2*/("""
alert("No se pudo eliminar el registro de la base de datos. ");
"""),format.raw/*198.1*/("""}"""),format.raw/*198.2*/("""
"""),format.raw/*199.1*/("""}"""),format.raw/*199.2*/("""

function adicionar(data)
"""),format.raw/*202.1*/("""{"""),format.raw/*202.2*/("""
if(data=="ok")
"""),format.raw/*204.1*/("""{"""),format.raw/*204.2*/("""
$("#tabla").append(nuevaFila);
"""),format.raw/*206.1*/("""}"""),format.raw/*206.2*/("""
else
"""),format.raw/*208.1*/("""{"""),format.raw/*208.2*/("""
alert("No se pudo insertar el registro en la base de datos. ");
"""),format.raw/*210.1*/("""}"""),format.raw/*210.2*/("""
"""),format.raw/*211.1*/("""}"""),format.raw/*211.2*/("""

$( ".tabs" ).tabs();

</script>"""))}
    }
    
<<<<<<< HEAD
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
=======
    def render(permisos:List[Permiso]): play.api.templates.HtmlFormat.Appendable = apply(permisos)
    
    def f:((List[Permiso]) => play.api.templates.HtmlFormat.Appendable) = (permisos) => apply(permisos)
>>>>>>> 4d44da7d489b48f84b12a1a6b3ad9e4d2caf1200
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
                    DATE: Sun Mar 30 16:04:02 COT 2014
                    SOURCE: /home/camilo/Documents/InpahuGeneracionInformes/glassfish/ModuloInformes/app/views/admin.scala.html
                    HASH: a1bcc22badda884f551e1d983a6a77623bc29830
                    MATRIX: 796->2|812->10|850->11|958->89|1036->140|1064->141|1179->229|1207->230|1252->248|1280->249|1310->252|1338->253
                    LINES: 29->2|29->2|29->2|31->4|33->6|33->6|36->9|36->9|36->9|36->9|37->10|37->10
=======
                    DATE: Mon Apr 07 16:12:50 COT 2014
                    SOURCE: /home/camilo/Documents/InpahuGeneracionInformes/ModuloInformes/app/views/admin.scala.html
                    HASH: bbafc2f888d3b006008a059c3cf8abd79418ee4b
                    MATRIX: 781->1|899->25|935->27|951->35|989->36|1619->631|1677->667|1803->758|1843->782|1882->783|1929->795|1945->802|1992->827|2039->839|2055->846|2105->874|2152->886|2192->917|2231->918|2269->921|2285->928|2338->959|2376->961|2392->968|2440->994|2474->997|2570->1057|2586->1064|2636->1092|2716->1141|2905->1299|3020->1386|3049->1387|3485->1795|3514->1796|3601->1855|3630->1856|3811->2010|3839->2011|3903->2047|3932->2048|4137->2226|4165->2227|4196->2231|4224->2232|4254->2235|4282->2236|4356->2283|4384->2284|4525->2397|4554->2398|4626->2443|4654->2444|4684->2447|4712->2448|4773->2481|4802->2482|4907->2560|4935->2561|5003->2602|5031->2603|5301->2846|5329->2847|5450->2940|5479->2941|5556->2990|5585->2991|5649->3026|5679->3027|5783->3102|5813->3103|5873->3134|5903->3135|5984->3187|6014->3188|6051->3197|6081->3198|6116->3205|6145->3206|6261->3294|6290->3295|6330->3307|6359->3308|6506->3427|6535->3428|6566->3431|6595->3432|6625->3434|6654->3435|6690->3443|6719->3444|6776->3472|6806->3473|6910->3548|6940->3549|7000->3580|7030->3581|7111->3633|7141->3634|7178->3643|7208->3644|7243->3651|7272->3652|7384->3736|7413->3737|7457->3753|7486->3754|7742->3981|7772->3982|7867->4048|7897->4049|7940->4064|7969->4065|7998->4066|8027->4067|8162->4173|8192->4174|8253->4207|8282->4208|8343->4241|8372->4242|8408->4250|8437->4251|8498->4284|8527->4285|8557->4287|8586->4288|8655->4328|8685->4329|8814->4429|8844->4430|8950->4507|8980->4508|9039->4538|9069->4539|9139->4580|9169->4581|9218->4601|9248->4602|9335->4661|9365->4662|9425->4693|9455->4694|9531->4742|9561->4743|9596->4750|9625->4751|9658->4756|9687->4757|9790->4832|9819->4833|9874->4860|9903->4861|9947->4877|9976->4878|10038->4912|10067->4913|10101->4919|10130->4920|10223->4985|10252->4986|10281->4987|10310->4988|10365->5015|10394->5016|10438->5032|10467->5033|10527->5065|10556->5066|10590->5072|10619->5073|10712->5138|10741->5139|10770->5140|10799->5141
                    LINES: 26->1|29->1|30->2|30->2|30->2|46->18|46->18|51->23|51->23|51->23|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|56->28|56->28|56->28|57->29|59->31|59->31|59->31|63->35|72->44|77->49|77->49|87->59|87->59|89->61|89->61|93->65|93->65|94->66|94->66|100->72|100->72|101->73|101->73|102->74|102->74|104->76|104->76|107->79|107->79|109->81|109->81|111->83|111->83|113->85|113->85|115->87|115->87|117->89|117->89|127->99|127->99|130->102|130->102|133->105|133->105|135->107|135->107|138->110|138->110|139->111|139->111|141->113|141->113|142->114|142->114|143->115|143->115|146->118|146->118|148->120|148->120|151->123|151->123|152->124|152->124|153->125|153->125|155->127|155->127|156->128|156->128|159->131|159->131|160->132|160->132|162->134|162->134|163->135|163->135|164->136|164->136|167->139|167->139|169->141|169->141|173->145|173->145|173->145|173->145|174->146|174->146|175->147|175->147|179->151|179->151|181->153|181->153|183->155|183->155|185->157|185->157|187->159|187->159|189->161|189->161|191->163|191->163|196->168|196->168|200->172|200->172|201->173|201->173|203->175|203->175|203->175|203->175|205->177|205->177|206->178|206->178|208->180|208->180|209->181|209->181|210->182|210->182|214->186|214->186|218->190|218->190|220->192|220->192|222->194|222->194|224->196|224->196|226->198|226->198|227->199|227->199|230->202|230->202|232->204|232->204|234->206|234->206|236->208|236->208|238->210|238->210|239->211|239->211
>>>>>>> 4d44da7d489b48f84b12a1a6b3ad9e4d2caf1200
                    -- GENERATED --
                */
            