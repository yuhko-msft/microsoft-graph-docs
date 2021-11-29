---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new EducationRubric()
requestBody.displayName = "Example Points Rubric";
requestBody.description = new EducationItemBody();
requestBody.description.content = "This is an example of a rubric with points";
requestBody.description.contentType = "text";
requestBody.levels = [
			new RubricLevel();
requestBody.levels.additionalData = new Map([
					["displayName", "Good"];
						 ["content" , ""],
						 ["contentType" , "text"],
						 ["@odata.type" , "#microsoft.graph.educationAssignmentPointsGradeType"],
						 ["maxPoints" , 2],
				]);
			new RubricLevel();
requestBody.levels.additionalData = new Map([
					["displayName", "Poor"];
						 ["content" , ""],
						 ["contentType" , "text"],
						 ["@odata.type" , "#microsoft.graph.educationAssignmentPointsGradeType"],
						 ["maxPoints" , 1],
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
					["weight", 50.0];
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
					["weight", 50.0];
				]);
		]
	],
requestBody.grading = new EducationAssignmentGradeType();
requestBody.grading.additionalData = new Map([
			["@odata.type", "#microsoft.graph.educationAssignmentPointsGradeType"];
		]);
const result = async () => {
	await graphServiceClient.education.me.rubrics.post(requestBody);
}


```