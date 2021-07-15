---
title: "Update deviceManagementReusablePolicySetting"
description: "Update the properties of a deviceManagementReusablePolicySetting object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementReusablePolicySetting
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md) object.

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
PATCH /deviceManagement/reusablePolicySettings/{deviceManagementReusablePolicySettingId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md) object.

The following table shows the properties that are required when you update the [deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|reusable setting creation date and time. This property is read-only.|
|description|String|reusable setting description supplied by user.|
|displayName|String|reusable setting display name supplied by user.|
|lastModifiedDateTime|DateTimeOffset|date and time when reusable setting was last modified. This property is read-only.|
|referencingConfigurationPolicyCount|Int32|count of configuration policies referencing the current reusable setting. Valid values 0 to 2147483647. This property is read-only.|
|settingDefinitionId|String|setting definition id associated with this reusable setting.|
|settingInstance|[deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md)|reusable setting configuration instance|
|version|Int32|version number for reusable setting. Valid values 0 to 2147483647. This property is read-only.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementreusablepolicysetting"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/reusablePolicySettings/{deviceManagementReusablePolicySettingId}
Content-Type: application/json
Content-length: 362

{
  "@odata.type": "#microsoft.graph.deviceManagementReusablePolicySetting",
  "description": "String",
  "displayName": "String",
  "referencingConfigurationPolicyCount": "Integer",
  "settingDefinitionId": "String",
  "settingInstance": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstance"
  },
  "version": "Integer"
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
  "@odata.type": "#microsoft.graph.deviceManagementReusablePolicySetting",
  "id": "ca682ad0-2ad0-ca68-d02a-68cad02a68ca",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "referencingConfigurationPolicyCount": "Integer",
  "settingDefinitionId": "String",
  "settingInstance": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstance"
  },
  "version": "Integer"
}
```

