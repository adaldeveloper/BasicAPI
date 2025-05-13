// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsers()
  $('#usersTable').DataTable();
});


async function loadUsers() {
  const response = await fetch('users')

  if (!response.ok) return new Error('Error :' + response.status)

  const users = response.json();

      /*<tr>
        <td>Tiger Nixon</td>
        <td>System Architect</td>
        <td>Edinburgh</td>
        <td>61</td>
        <td>2011/04/25</td>
        <td>$320,800</td>
        <td><a href="#" className="btn btn-danger btn-circle">
          <i className="fas fa-trash"></i>
        </a></td>
      </tr>

       */
}
