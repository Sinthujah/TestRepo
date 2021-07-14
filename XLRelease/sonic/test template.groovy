// Exported from:        http://qe-centos-ha2:5516/#/templates/Folder10f432c5e9a048db8bb13c25abebacd0-Release75fb1a003c1c456f9bb34fe683a6e32a/code
// Release version:      10.2.0-708.113
// Date created:         Wed Jul 14 11:47:41 CEST 2021

xlr {
  template('test template') {
    folder('sonic')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-02T09:00:00+0200')
    phases {
      phase('Phase 1') {
        color '#0079BC'
        tasks {
          manual('task 1') {
            description 'this is task 1 for manual task'
          }
        }
      }
    }
    
  }
}