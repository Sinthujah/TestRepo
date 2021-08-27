// Exported from:        http://minserver:5516/#/templates/Folder4fd378b2bba743b1ab715af17b9b8fd6-Releaseac399590c0074b478fe3a022f4be556b/code
// Release version:      10.3.0-SNAPSHOT
// Date created:         Fri Aug 27 15:02:56 IST 2021

xlr {
  template('Template_9') {
    folder('Folder_9')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-08-25T09:00:00+0530')
    phases {
      phase('New Phase') {
        tasks {
          custom('CreateDeliverytask') {
            script {
              type 'delivery.CreateDelivery'
              pattern 'Folder_9/pattern9'
              folder 'Folder_9/Subfolder9'
              title 'testname'
            }
          }
          custom('Find Delivery task') {
            script {
              type 'delivery.FindDelivery'
              
            }
          }
          custom('Find or Create Delivery task') {
            script {
              type 'delivery.FindOrCreateDelivery'
              pattern 'Folder_9/Subfolder9/patterninsubfolder'
              searchStrategy 'Search by criteria'
              folder 'Folder_9'
              fallback false
            }
          }
          manual('Manual task 1') {
            
          }
        }
      }
    }
    
  }
}