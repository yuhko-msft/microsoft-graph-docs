---
title: "Create securityConfigurationTask"
description: "Create a new securityConfigurationTask object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create securityConfigurationTask
Namespace: microsoft.graph



Create a new [securityConfigurationTask](../resources/securityconfigurationtask.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
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
POST ** Collection URI for microsoft.graph.securityConfigurationTask not found
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
|assignedTo|String|The name or email of the admin this task is assigned to. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|category|deviceAppManagementTaskCategory|The category. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md). Possible values are: `unknown`, `advancedThreatProtection`.|
|createdDateTime|DateTimeOffset|The created date. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|creator|String|The email address of the creator. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|creatorNotes|String|Notes from the creator. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|description|String|The description. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|displayName|String|The name. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|dueDateTime|DateTimeOffset|The due date. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|priority|deviceAppManagementTaskPriority|The priority. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md). Possible values are: `none`, `high`, `low`.|
|status|deviceAppManagementTaskStatus|The status. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md). Possible values are: `unknown`, `pending`, `active`, `completed`, `rejected`.|
|applicablePlatform|endpointSecurityConfigurationApplicablePlatform|The applicable platform. Possible values are: `unknown`, `macOS`, `windows10AndLater`, `windows10AndWindowsServer`.|
|endpointSecurityPolicy|endpointSecurityConfigurationType|The endpoint security policy type. Possible values are: `unknown`, `antivirus`, `diskEncryption`, `firewall`, `endpointDetectionAndResponse`, `attackSurfaceReduction`, `accountProtection`.|
|endpointSecurityPolicyProfile|endpointSecurityConfigurationProfileType|The endpoint security policy profile. Possible values are: `unknown`, `antivirus`, `windowsSecurity`, `bitLocker`, `fileVault`, `firewall`, `firewallRules`, `endpointDetectionAndResponse`, `deviceControl`, `appAndBrowserIsolation`, `exploitProtection`, `webProtection`, `applicationControl`, `attackSurfaceReductionRules`, `accountProtection`.|
|insights|String|Information about the mitigation.|
|intendedSettings|[keyValuePair](../resources/keyvaluepair.md) collection|The intended settings and their values.|
|managedDeviceCount|Int32|The number of vulnerable devices.|



## Response

If successful, this method returns a `201 Created` response code and a [securityConfigurationTask](../resources/securityconfigurationtask.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_securityconfigurationtask_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.securityConfigurationTask not found
Content-Type: application/json
Content-length: 595

{
  "@odata.type": "#microsoft.graph.securityConfigurationTask",
  "assignedTo": "String",
  "category": "String",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.securityConfigurationTask"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.securityConfigurationTask",
  "id": "1377d250-d250-1377-50d2-771350d27713",
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

