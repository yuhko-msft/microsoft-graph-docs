---
title: "securityConfigurationTask resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityConfigurationTask resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceAppManagementTask](../resources/deviceappmanagementtask.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List securityConfigurationTasks](../api/securityconfigurationtask-list.md)|[securityConfigurationTask](../resources/securityconfigurationtask.md) collection|Get a list of the [securityConfigurationTask](../resources/securityconfigurationtask.md) objects and their properties.|
|[Create securityConfigurationTask](../api/securityconfigurationtask-create.md)|[securityConfigurationTask](../resources/securityconfigurationtask.md)|Create a new [securityConfigurationTask](../resources/securityconfigurationtask.md) object.|
|[Get securityConfigurationTask](../api/securityconfigurationtask-get.md)|[securityConfigurationTask](../resources/securityconfigurationtask.md)|Read the properties and relationships of a [securityConfigurationTask](../resources/securityconfigurationtask.md) object.|
|[Update securityConfigurationTask](../api/securityconfigurationtask-update.md)|[securityConfigurationTask](../resources/securityconfigurationtask.md)|Update the properties of a [securityConfigurationTask](../resources/securityconfigurationtask.md) object.|
|[Delete securityConfigurationTask](../api/securityconfigurationtask-delete.md)|None|Deletes a [securityConfigurationTask](../resources/securityconfigurationtask.md) object.|
|[updateStatus](../api/securityconfigurationtask-updatestatus.md)|None|**TODO: Add Description**|
|[List managedDevices](../api/securityconfigurationtask-list-manageddevices.md)|[vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) collection|Get the vulnerableManagedDevices from the managedDevices navigation property.|
|[Add managedDevices](../api/securityconfigurationtask-post-manageddevices.md)|[vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md)|Add managedDevices by posting to the managedDevices collection.|
|[Remove managedDevices](../api/securityconfigurationtask-delete-manageddevices.md)|None|Remove a [vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicablePlatform|endpointSecurityConfigurationApplicablePlatform|**TODO: Add Description**. Possible values are: `unknown`, `macOS`, `windows10AndLater`, `windows10AndWindowsServer`.|
|assignedTo|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|category|deviceAppManagementTaskCategory|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md). Possible values are: `unknown`, `advancedThreatProtection`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|creator|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|creatorNotes|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|description|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|dueDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|endpointSecurityPolicy|endpointSecurityConfigurationType|**TODO: Add Description**. Possible values are: `unknown`, `antivirus`, `diskEncryption`, `firewall`, `endpointDetectionAndResponse`, `attackSurfaceReduction`, `accountProtection`.|
|endpointSecurityPolicyProfile|endpointSecurityConfigurationProfileType|**TODO: Add Description**. Possible values are: `unknown`, `antivirus`, `windowsSecurity`, `bitLocker`, `fileVault`, `firewall`, `firewallRules`, `endpointDetectionAndResponse`, `deviceControl`, `appAndBrowserIsolation`, `exploitProtection`, `webProtection`, `applicationControl`, `attackSurfaceReductionRules`, `accountProtection`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|insights|String|**TODO: Add Description**|
|intendedSettings|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description**|
|managedDeviceCount|Int32|**TODO: Add Description**|
|priority|deviceAppManagementTaskPriority|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md). Possible values are: `none`, `high`, `low`.|
|status|deviceAppManagementTaskStatus|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md). Possible values are: `unknown`, `pending`, `active`, `completed`, `rejected`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|managedDevices|[vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.securityConfigurationTask",
  "baseType": "microsoft.graph.deviceAppManagementTask",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.securityConfigurationTask",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "dueDateTime": "String (timestamp)",
  "category": "String",
  "priority": "String",
  "creator": "String",
  "creatorNotes": "String",
  "assignedTo": "String",
  "status": "String",
  "endpointSecurityPolicy": "String",
  "applicablePlatform": "String",
  "endpointSecurityPolicyProfile": "String",
  "insights": "String",
  "managedDeviceCount": "Integer",
  "intendedSettings": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ]
}
```

