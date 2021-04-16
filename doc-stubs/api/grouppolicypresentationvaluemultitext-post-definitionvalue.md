---
title: "Add groupPolicyDefinitionValue"
description: "Add definitionValue by posting to the definitionValue collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add groupPolicyDefinitionValue
Namespace: microsoft.graph



Add definitionValue by posting to the definitionValue collection.

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
POST /deviceManagement/groupPolicyConfigurations/{groupPolicyConfigurationId}/definitionValues/{groupPolicyDefinitionValueId}/presentationValues/{groupPolicyPresentationValueId}/definitionValue/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md) object.

The following table shows the properties that are required when you create the [groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|configurationType|groupPolicyConfigurationType|Specifies how the value should be configured. This can be either as a Policy or as a Preference. Possible values are: `policy`, `preference`.|
|createdDateTime|DateTimeOffset|The date and time the object was created.|
|enabled|Boolean|Enables or disables the associated group policy definition.|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified.|



## Response

If successful, this method returns a `204 No Content` response code and a [groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_grouppolicydefinitionvalue_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyConfigurations/{groupPolicyConfigurationId}/definitionValues/{groupPolicyDefinitionValueId}/presentationValues/{groupPolicyPresentationValueId}/definitionValue/$ref
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
  "truncated": true,
  "@odata.type": "microsoft.graph.groupPolicyDefinitionValue"
}
-->
``` http
HTTP/1.1 204 No Content
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

