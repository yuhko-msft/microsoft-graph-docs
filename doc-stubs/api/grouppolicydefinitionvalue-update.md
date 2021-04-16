---
title: "Update groupPolicyDefinitionValue"
description: "Update the properties of a groupPolicyDefinitionValue object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupPolicyDefinitionValue
Namespace: microsoft.graph



Update the properties of a [groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md) object.

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
PATCH /deviceManagement/groupPolicyConfigurations/{groupPolicyConfigurationId}/definitionValues/{groupPolicyDefinitionValueId}
PATCH /deviceManagement/groupPolicyConfigurations/{groupPolicyConfigurationId}/definitionValues/{groupPolicyDefinitionValueId}/presentationValues/{groupPolicyPresentationValueId}/definitionValue
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md) object.

The following table shows the properties that are required when you update the [groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|configurationType|groupPolicyConfigurationType|Specifies how the value should be configured. This can be either as a Policy or as a Preference. Possible values are: `policy`, `preference`.|
|createdDateTime|DateTimeOffset|The date and time the object was created.|
|enabled|Boolean|Enables or disables the associated group policy definition.|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified.|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_grouppolicydefinitionvalue"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyConfigurations/{groupPolicyConfigurationId}/definitionValues/{groupPolicyDefinitionValueId}
Content-Type: application/json
Content-length: 127

{
  "@odata.type": "#microsoft.graph.groupPolicyDefinitionValue",
  "configurationType": "String",
  "enabled": "Boolean"
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
  "@odata.type": "#microsoft.graph.groupPolicyDefinitionValue",
  "id": "b6480085-0085-b648-8500-48b6850048b6",
  "configurationType": "String",
  "createdDateTime": "String (timestamp)",
  "enabled": "Boolean",
  "lastModifiedDateTime": "String (timestamp)"
}
```

