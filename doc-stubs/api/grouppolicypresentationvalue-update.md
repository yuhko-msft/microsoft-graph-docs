---
title: "Update groupPolicyPresentationValue"
description: "Update the properties of a groupPolicyPresentationValue object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupPolicyPresentationValue
Namespace: microsoft.graph



Update the properties of a [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md) object.

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
PATCH /deviceManagement/groupPolicyConfigurations/{groupPolicyConfigurationId}/definitionValues/{groupPolicyDefinitionValueId}/presentationValues/{groupPolicyPresentationValueId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md) object.

The following table shows the properties that are required when you update the [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date and time the object was created.|
|lastModifiedDateTime|DateTimeOffset|The date and time the object was last modified.|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_grouppolicypresentationvalue"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyConfigurations/{groupPolicyConfigurationId}/definitionValues/{groupPolicyDefinitionValueId}/presentationValues/{groupPolicyPresentationValueId}
Content-Type: application/json
Content-length: 70

{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValue"
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
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValue",
  "id": "96fa078b-078b-96fa-8b07-fa968b07fa96",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)"
}
```

