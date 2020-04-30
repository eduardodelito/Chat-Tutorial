# Message Tutorial - MVVM

Sample Demo Application to demonstrate MVVM.

<ul>
  <li>Dagger -> dependency injection framework</li>
  <li>Navigation -> navigate to a destination</li>
  <li>DataBinding -> to bind UI components in the layouts</li>
  <li>Room Library -> used to handle database transaction (to cache the last server response from the itunes search API)</li>
  <li>Dimens.xml -> used to store all view sizes</li>
  <li>strings.xml -> used to store all string label that is needed by the application</li>
  <li>RecyclerView</li>
  <li>ConstraintLayout (Android Support)</li>
</ul>

The application project also contains 4 different modules.

<ul>
  <li>buildSrc - module that holds build specific classes. Currently it only have the Dependencies class. The Dependencies class contains library names and versions object that is used on gradle files</li>
  <li>common - module that contains shared function, interface, classes & resources.</li>
  <li>message-ui - module that handles the display/UI/UX of the track screens.</li>
  <li>database - module that handles the local database of the application.</li>
</ul>

<b>App Screenshot:</b>

<b>Sending Message Demo Screen:</b><br />
<img src="https://github.com/eduardodelito/Chat-Tutorial/blob/master/screenshot/Screenshot_1588244611.png" width="30%" />&nbsp;&nbsp;
 <br/> <br/>
