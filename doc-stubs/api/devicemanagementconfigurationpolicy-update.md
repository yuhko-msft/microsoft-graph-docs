---
title: "Update deviceManagementConfigurationPolicy"
description: "Update the properties of a deviceManagementConfigurationPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementConfigurationPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) object.

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
PATCH /deviceManagement/configurationPolicies/{deviceManagementConfigurationPolicyId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) object.

The following table shows the properties that are required when you update the [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md).

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
|technologies|deviceManagementConfigurationTechnologies|Technologies for this policy. Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`, `microsoftSense`.|
|templateReference|[deviceManagementConfigurationPolicyTemplateReference](../resources/devicemanagementconfigurationpolicytemplatereference.md)|Template reference information|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementconfigurationpolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/configurationPolicies/{deviceManagementConfigurationPolicyId}
Content-Type: application/json
Content-length: 437

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
  "technologies": "String",
  "templateReference": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationPolicyTemplateReference"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicy",
  "id": "b6a3558f-558f-b6a3-8f55-a3b68f55a3b6",
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
  "technologies": "String",
  "templateReference": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationPolicyTemplateReference"
  }
}
```

