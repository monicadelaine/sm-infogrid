document.writeln( '<div class="org-infogrid-authp">' );
document.writeln( ' <form method="post" action="">' );
document.writeln( '  <table>' );
document.writeln( '   <col class="label" />');
document.writeln( '   <col class="field" />');
document.writeln( '   <tr>');
document.writeln( '    <td colspan="2"><h3>Please sign in:</h3></td>' );
document.writeln( '   </tr>');
document.writeln( '   <tr>');
document.writeln( '    <td class="right">User name:</td>');
document.writeln( '    <td><input class="field" name="lid" id="lid" type="text" tabindex="1" /></td>' );
document.writeln( '   </tr>');
document.writeln( '   <tr>');
document.writeln( '    <td class="right">Password:</td>');
document.writeln( '    <td><input class="field" name="lid-credential" type="password" tabindex="2" /><input type="hidden" name="lid-credtype" value="simple-password"></td>' );
document.writeln( '   </tr>');
document.writeln( '   <tr>');
document.writeln( '    <td class="submit" colspan="2"><input class="submit" name="submit" type="submit" value="Sign in" tabindex="3" /></td>');
document.writeln( '   </tr>');
document.writeln( '  </table>' );
document.writeln( ' </form>' );
document.writeln( '</div>' );
document.getElementById('lid').focus();
document.getElementById('lid').select();