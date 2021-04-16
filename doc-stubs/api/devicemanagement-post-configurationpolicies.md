---
title: "Create deviceManagementConfigurationPolicy"
description: "Create a new deviceManagementConfigurationPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementConfigurationPolicy
Namespace: microsoft.graph



Create a new deviceManagementConfigurationPolicy object.

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
POST /deviceManagement/configurationPolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) object.

The following table shows the properties that are required when you create the [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Policy creation date and time. This property is read-only.|
|creationSource|String|Policy creation source|
|description|String|Policy description|
|isAssigned|Boolean|Policy assignment status. This property is read-only.|
|lastModifiedDateTime|DateTimeOffset|Policy last modification date and time. This property is read-only.|
|name|String|Policy name|
|platforms|deviceManagementConfigurationPlatforms|Platforms for this policy. Possible values are: `none`, `macOS`, `windows10X`, `windows10`.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|settingCount|Int32|Number of settings. This property is read-only.|
|technologies|deviceManagementConfigurationTechnologies|Technologies for this policy. Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementconfigurationpolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/configurationPolicies
Content-Type: application/json
Content-length: 314

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicy",
  "creationSource": "String",
  "description": "String",
  "isAssigned": "Boolean",
  "name": "String",
  "platforms": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "settingCount": "Integer",
  "technologies": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementConfigurationPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicy",
  "id": "f30bb6dc-b6dc-f30b-dcb6-0bf3dcb60bf3",
  "createdDateTime": "String (timestamp)",
  "creationSource": "String",
  "description": "String",
  "isAssigned": "Boolean",
  "lastModifiedDateTime": "String (timestamp)",
  "name": "String",
  "platforms": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "settingCount": "Integer",
  "technologies": "String"
}
```

