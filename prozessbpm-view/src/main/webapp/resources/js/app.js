/**
 * 
 */
Ext.application({
    requires: ['Ext.container.Viewport'],
    name: 'PBPM',

    appFolder: 'resources/js/project/app',

    controllers: ["CrudGenericController"],
    
    launch: function() {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: [
                {
                    xtype: 'crudgenericpanel'
                }
            ]
        });
    }
});