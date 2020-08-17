---
title: "Update securityConfigurationTask"
description: "Update the properties of a securityConfigurationTask object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update securityConfigurationTask
Namespace: microsoft.graph

Update the properties of a [securityConfigurationTask](../resources/securityconfigurationtask.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /securityConfigurationTask
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [securityConfigurationTask](../resources/securityconfigurationtask.md) object.

The following table shows the properties that are required when you create the [securityConfigurationTask](../resources/securityconfigurationtask.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|description|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|dueDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|category|deviceAppManagementTaskCategory|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md). Possible values are: `unknown`, `advancedThreatProtection`.|
|priority|deviceAppManagementTaskPriority|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md). Possible values are: `none`, `high`, `low`.|
|creator|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|creatorNotes|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|assignedTo|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|status|deviceAppManagementTaskStatus|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md). Possible values are: `unknown`, `pending`, `active`, `completed`, `rejected`.|
|endpointSecurityPolicy|endpointSecurityConfigurationType|**TODO: Add Description**. Possible values are: `unknown`, `antivirus`, `diskEncryption`, `firewall`, `endpointDetectionAndResponse`, `attackSurfaceReduction`, `accountProtection`.|
|applicablePlatform|endpointSecurityConfigurationApplicablePlatform|**TODO: Add Description**. Possible values are: `unknown`, `macOS`, `windows10AndLater`, `windows10AndWindowsServer`.|
|endpointSecurityPolicyProfile|endpointSecurityConfigurationProfileType|**TODO: Add Description**. Possible values are: `unknown`, `antivirus`, `windowsSecurity`, `bitLocker`, `fileVault`, `firewall`, `firewallRules`, `endpointDetectionAndResponse`, `deviceControl`, `appAndBrowserIsolation`, `exploitProtection`, `webProtection`, `applicationControl`, `attackSurfaceReductionRules`, `accountProtection`.|
|insights|String|**TODO: Add Description**|
|managedDeviceCount|Int32|**TODO: Add Description**|
|intendedSettings|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [securityConfigurationTask](../resources/securityconfigurationtask.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_securityconfigurationtask"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/securityConfigurationTask
Content-Type: application/json
Content-length: 595

{
  "@odata.type": "#microsoft.graph.securityConfigurationTask",
  "displayName": "String",
  "description": "String",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.securityConfigurationTask",
  "id": "82e24c66-4c66-82e2-664c-e282664ce282",
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

