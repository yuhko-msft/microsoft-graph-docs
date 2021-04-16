---
title: "securityConfigurationTask resource type"
description: "A security configuration task."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityConfigurationTask resource type

Namespace: microsoft.graph



A security configuration task.


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
|[List managedDevices](../api/securityconfigurationtask-list-manageddevices.md)|[vulnerableManagedDevice](../resources/vulnerablemanageddevice.md) collection|Get the vulnerableManagedDevice resources from the managedDevices navigation property.|
|[Add vulnerableManagedDevice](../api/securityconfigurationtask-post-manageddevices.md)|[vulnerableManagedDevice](../resources/vulnerablemanageddevice.md)|Add managedDevices by posting to the managedDevices collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicablePlatform|endpointSecurityConfigurationApplicablePlatform|The applicable platform. Possible values are: `unknown`, `macOS`, `windows10AndLater`, `windows10AndWindowsServer`.|
|assignedTo|String|The name or email of the admin this task is assigned to. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|category|deviceAppManagementTaskCategory|The category. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md). Possible values are: `unknown`, `advancedThreatProtection`.|
|createdDateTime|DateTimeOffset|The created date. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|creator|String|The email address of the creator. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|creatorNotes|String|Notes from the creator. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|description|String|The description. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|displayName|String|The name. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|dueDateTime|DateTimeOffset|The due date. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|endpointSecurityPolicy|endpointSecurityConfigurationType|The endpoint security policy type. Possible values are: `unknown`, `antivirus`, `diskEncryption`, `firewall`, `endpointDetectionAndResponse`, `attackSurfaceReduction`, `accountProtection`.|
|endpointSecurityPolicyProfile|endpointSecurityConfigurationProfileType|The endpoint security policy profile. Possible values are: `unknown`, `antivirus`, `windowsSecurity`, `bitLocker`, `fileVault`, `firewall`, `firewallRules`, `endpointDetectionAndResponse`, `deviceControl`, `appAndBrowserIsolation`, `exploitProtection`, `webProtection`, `applicationControl`, `attackSurfaceReductionRules`, `accountProtection`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|insights|String|Information about the mitigation.|
|intendedSettings|[keyValuePair](../resources/keyvaluepair.md) collection|The intended settings and their values.|
|managedDeviceCount|Int32|The number of vulnerable devices.|
|priority|deviceAppManagementTaskPriority|The priority. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md). Possible values are: `none`, `high`, `low`.|
|status|deviceAppManagementTaskStatus|The status. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md). Possible values are: `unknown`, `pending`, `active`, `completed`, `rejected`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|managedDevices|[vulnerableManagedDevice](../resources/vulnerablemanageddevice.md) collection|The vulnerable managed devices.|

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
  "assignedTo": "String",
  "category": "String",
  "createdDateTime": "String (timestamp)",
  "creator": "String",
  "creatorNotes": "String",
  "description": "String",
  "displayName": "String",
  "dueDateTime": "String (timestamp)",
  "priority": "String",
  "status": "String",
  "applicablePlatform": "String",
  "endpointSecurityPolicy": "String",
  "endpointSecurityPolicyProfile": "String",
  "insights": "String",
  "intendedSettings": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "managedDeviceCount": "Integer"
}
```

