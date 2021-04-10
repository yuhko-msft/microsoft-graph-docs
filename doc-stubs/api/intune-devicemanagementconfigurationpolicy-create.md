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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md) object.

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
In the request body, supply a JSON representation of the [deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md) object.

The following table shows the properties that are required when you create the [deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|name|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|platforms|deviceManagementConfigurationPlatforms|**TODO: Add Description**. Possible values are: `none`, `macOS`, `windows10X`, `windows10`.|
|technologies|deviceManagementConfigurationTechnologies|**TODO: Add Description**. Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|settingCount|Int32|**TODO: Add Description**|
|creationSource|String|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|
|isAssigned|Boolean|**TODO: Add Description**|
|templateReference|[deviceManagementConfigurationPolicyTemplateReference](../resources/intune-devicemanagementconfigurationpolicytemplatereference.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementconfigurationpolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/configurationPolicies
Content-Type: application/json
Content-length: 437

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicy",
  "name": "String",
  "description": "String",
  "platforms": "String",
  "technologies": "String",
  "settingCount": "Integer",
  "creationSource": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "isAssigned": "Boolean",
  "templateReference": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationPolicyTemplateReference"
  }
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
  "name": "String",
  "description": "String",
  "platforms": "String",
  "technologies": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "settingCount": "Integer",
  "creationSource": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "isAssigned": "Boolean",
  "templateReference": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationPolicyTemplateReference"
  }
}
```

