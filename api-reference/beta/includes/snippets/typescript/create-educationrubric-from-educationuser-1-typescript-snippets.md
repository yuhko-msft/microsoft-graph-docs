---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new EducationRubric()
requestBody.displayName = "Example Credit Rubric";
requestBody.description = new EducationItemBody();
requestBody.description.content = "This is an example of a credit rubric (no points)";
requestBody.description.contentType = "text";
requestBody.levels = [
			new RubricLevel();
requestBody.levels.additionalData = new Map([
					["displayName", "Good"];
						 ["content" , ""],
						 ["contentType" , "text"],
				]);
			new RubricLevel();
requestBody.levels.additionalData = new Map([
					["displayName", "Poor"];
						 ["content" , ""],
						 ["contentType" , "text"],
				]);
		]
	],
requestBody.qualities = [
			new RubricQuality();
requestBody.qualities.additionalData = new Map([
						 ["content" , "Argument"],
						 ["contentType" , "text"],
					["criteria", [
									 ["content" , "The essay's argument is persuasive."],
									 ["contentType" , "text"],
									 ["content" , "The essay's argument does not make sense."],
									 ["contentType" , "text"],
						]
					],
				]);
			new RubricQuality();
requestBody.qualities.additionalData = new Map([
						 ["content" , "Spelling and Grammar"],
						 ["contentType" , "text"],
					["criteria", [
									 ["content" , "The essay uses proper spelling and grammar with few or no errors."],
									 ["contentType" , "text"],
									 ["content" , "The essay has numerous errors in spelling and/or grammar."],
									 ["contentType" , "text"],
						]
					],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.education.me.rubrics.post(requestBody);
}


```